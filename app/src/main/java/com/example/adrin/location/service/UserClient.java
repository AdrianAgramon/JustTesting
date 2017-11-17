package com.example.adrin.location.service;


import com.example.adrin.location.model.Usuario;


import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by agram on 08/11/2017.
 */

public interface UserClient {

    @POST("alta")
    Call<Boolean>createAccount(@Body  Usuario usuario);

    @GET("login")
    Call <Boolean> logIn (@QueryMap()Map<String, String> options);

    @POST("guardarPuntuacion/{username}")
    Call<Boolean> envioPuntuacion(@Path("username") String username, @QueryMap() Map<String, Integer> options);



}
