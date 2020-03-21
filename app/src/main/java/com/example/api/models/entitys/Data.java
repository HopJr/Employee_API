package com.example.api.models.entitys;

import java.util.List;

public class Data {
    private String status;
    private List<Employee> data;

    public String getStatus() {
        return status;
    }

    public Data setStatus(String status) {
        this.status = status;
        return this;
    }

    public List<Employee> getData() {
        return data;
    }

    public Data setData(List<Employee> data) {
        this.data = data;
        return this;
    }
}
