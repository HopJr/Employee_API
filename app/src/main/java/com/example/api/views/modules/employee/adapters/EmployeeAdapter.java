package com.example.api.views.modules.employee.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.api.R;
import com.example.api.models.entitys.Employee;
import com.example.api.views.modules.employee.adapters.viewholders.EmployeeViewHolder;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeViewHolder> {
    private List<Employee> employee;

    public EmployeeAdapter(List<Employee> employee) {
        this.employee = employee;
    }

    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_employee, parent, false);
        return new EmployeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {
        holder.Bind(employee.get(position));

    }

    @Override
    public int getItemCount() {
        return employee.size();
    }
}
