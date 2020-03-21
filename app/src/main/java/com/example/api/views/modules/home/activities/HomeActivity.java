package com.example.api.views.modules.home.activities;

import android.content.Intent;
import android.widget.Button;

import com.example.api.R;
import com.example.api.base.BaseActivity;
import com.example.api.views.modules.employee.activities.EmployeeActivity;

public class HomeActivity extends BaseActivity {
    private Button btGetApi;

    @Override
    protected int setContentViewId() {
        return R.layout.activity_home_;
    }

    @Override
    protected void init() {
        btGetApi = findViewById(R.id.btGetApi);
        btGetApi.setOnClickListener(v -> startActivity(new Intent(getApplication(), EmployeeActivity.class)));
    }
}
