package com.example.api.views.modules.employee.activities;

import android.app.ProgressDialog;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.api.R;
import com.example.api.models.entitys.Employee;
import com.example.api.presenters.EmployeePresenter;
import com.example.api.base.BaseActivity;
import com.example.api.views.modules.employee.adapters.EmployeeAdapter;

import java.util.List;

public class EmployeeActivity extends BaseActivity implements EmployeePresenter.GetEmployeeCallBack {
    private EmployeeAdapter adapter;
    private RecyclerView rvEmployee;
    private EmployeePresenter presenter = new EmployeePresenter();
    private ProgressDialog progressDialog;

    @Override
    protected int setContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        progressDialog = new ProgressDialog(this);
        rvEmployee = findViewById(R.id.rvEmployee);
        presenter.getEmployee(this);
    }

    @Override
    public void showLoading() {
        progressDialog.show();
    }

    @Override
    public void hideLoading() {
        progressDialog.dismiss();
    }

    @Override
    public void onSuccess(List<Employee> employees) {
        adapter = new EmployeeAdapter(employees);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(EmployeeActivity.this);
        rvEmployee.setLayoutManager(layoutManager);
        rvEmployee.setAdapter(adapter);
    }

    @Override
    public void onFail(Throwable throwable) {
        Toast.makeText(EmployeeActivity.this, throwable.getMessage(), Toast.LENGTH_SHORT).show();
    }
}
