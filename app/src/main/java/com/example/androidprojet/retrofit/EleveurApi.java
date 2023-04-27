package com.example.androidprojet.retrofit;

import com.example.androidprojet.model.Eleveur;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface EleveurApi {
    @GET("/employee/get-all")
    Call<List<Eleveur>> getAllEmployees();

    @POST("/api/v1/breeders")
    Call<Eleveur> save(@Body Eleveur eleveur);
}
