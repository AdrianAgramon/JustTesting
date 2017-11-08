package com.example.adrin.location.service;

import com.example.adrin.location.model.User;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by agram on 08/11/2017.
 */

public interface UserClient {

    @POST("user")
    Call<User>createAccount(@Body  User user);


}
