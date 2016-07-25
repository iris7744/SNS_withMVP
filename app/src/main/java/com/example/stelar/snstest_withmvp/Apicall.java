package com.example.stelar.snstest_withmvp;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Stelar on 2016-07-25.
 */
public interface Apicall {

    @FormUrlEncoded
    @POST("write/")
    Call<ApiResult> write(@Field("account_number")  String account_number,@Field("body") String body);
}
