package com.example.stelar.snstest_withmvp;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by Stelar on 2016-07-25.
 */
public class MainModel {

    String account_number = "575783e219a228.10596797";
    Apicall apicall = RetrofitCreator.makeApicall();

    private static MainModel mainModel = new MainModel();

    public interface PostResult{
        void getcodeToserver(int code);
        void getErrorMessage(String message);
    }

    public static MainModel sharedInstance(){
        return mainModel;
    }

    public void connectServer(String message,PostResult postResult){
        messagePost(message,postResult);
    }

    public void messagePost(String message,final PostResult postResult) {
        apicall.write(account_number,message).enqueue(new Callback<ApiResult>() {
            @Override
            public void onResponse(Call<ApiResult> call, Response<ApiResult> response) {
                ApiResult apiResult = response.body();
                postResult.getcodeToserver(apiResult.getCode());
            }

            @Override
            public void onFailure(Call<ApiResult> call, Throwable t) {
                postResult.getErrorMessage(t.getMessage());
            }
        });
    }
}
