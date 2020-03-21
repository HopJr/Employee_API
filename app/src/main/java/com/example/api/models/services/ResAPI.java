package com.example.api.models.services;

import com.example.api.models.entitys.Data;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ResAPI {
    @GET("/bins/svtpg")
    Call<Data> GetData();
}
