package com.example.api.models.repositories;

import com.example.api.models.services.ResAPI;
import com.example.api.models.entitys.Data;
import com.example.api.models.entitys.Employee;
import com.example.api.models.retrofitConfig.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EmployeeRepository {
    public void requestApi(final RequestApiCallBack callBack) {
        ResAPI resAPI = RetrofitClient.getRetrofitClient().create(ResAPI.class);
        Call<Data> call = resAPI.GetData();
        call.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                Data data = response.body();
                List<Employee> employees = data.getData();
                callBack.onSuccess(employees);
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {
                callBack.onFail(t);
            }
        });
    }

    public interface RequestApiCallBack {
        void onSuccess(List<Employee> employees);

        void onFail(Throwable throwable);
    }
}
