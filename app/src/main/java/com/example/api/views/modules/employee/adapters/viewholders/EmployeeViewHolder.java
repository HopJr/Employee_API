package com.example.api.views.modules.employee.adapters.viewholders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.api.R;
import com.example.api.models.entitys.Employee;

public class EmployeeViewHolder extends RecyclerView.ViewHolder {
    private TextView tvName;
    private TextView tvId;
    private TextView tvSalary;

    public EmployeeViewHolder(@NonNull View itemView) {
        super(itemView);
        tvId = itemView.findViewById(R.id.tvId);
        tvName = itemView.findViewById(R.id.tvName);
        tvSalary = itemView.findViewById(R.id.tvSalary);
    }

    public void Bind(Employee employee) {
        tvId.setText(employee.getId());
        tvName.setText(employee.getEmployeeName());
        tvSalary.setText(employee.getEmployeeSalary());
    }
}
