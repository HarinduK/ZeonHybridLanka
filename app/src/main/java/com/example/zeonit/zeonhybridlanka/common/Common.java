package com.example.zeonit.zeonhybridlanka.common;

import com.example.zeonit.zeonhybridlanka.Remote.IMyAPI;
import com.example.zeonit.zeonhybridlanka.Remote.RetrofitClient;

public class Common {

    public  static final String BASE_URL="http://192.168.8.110/QR/app/";

    public static IMyAPI getApi(){
        return RetrofitClient.getClient(BASE_URL).create(IMyAPI.class);
    }

}
