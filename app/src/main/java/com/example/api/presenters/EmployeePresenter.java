package com.example.api.presenters;

import com.example.api.models.repositories.EmployeeRepository;
import com.example.api.models.entitys.Employee;

import java.util.List;

public class EmployeePresenter {
    private EmployeeRepository employeeRepository = new EmployeeRepository();

    public void getEmployee(final GetEmployeeCallBack callBack) {
        callBack.showLoading();
        employeeRepository.requestApi(new EmployeeRepository.RequestApiCallBack() {
            @Override
            public void onSuccess(List<Employee> employees) {
                callBack.onSuccess(employees);
                callBack.hideLoading();
            }

            @Override
            public void onFail(Throwable throwable) {
                callBack.onFail(throwable);
                callBack.hideLoading();
            }
        });
    }

    public interface GetEmployeeCallBack {
        void showLoading();
        void hideLoading();
        void onSuccess(List<Employee> employees);
        void onFail(Throwable throwable);
    }
}
