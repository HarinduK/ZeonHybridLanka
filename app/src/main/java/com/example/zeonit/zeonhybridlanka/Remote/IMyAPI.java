package com.example.zeonit.zeonhybridlanka.Remote;

import com.example.zeonit.zeonhybridlanka.model.APIResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface IMyAPI {
    @FormUrlEncoded
    @POST("login.php")
    Call<APIResponse> loginUser(@Field("user") String user, @Field("password") String password);

    @FormUrlEncoded
    @POST("TrackingDetails.php")
    Call<APIResponse> details(@Field("uid") String uid);


}
