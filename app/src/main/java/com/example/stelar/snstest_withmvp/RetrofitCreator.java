package com.example.stelar.snstest_withmvp;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by Stelar on 2016-07-25.
 */
public class RetrofitCreator {

    public static Apicall makeApicall(){
        Apicall apicall = new Retrofit.Builder().addConverterFactory(JacksonConverterFactory.create())
                .baseUrl("http://ykikisoft.cafe24.com/fakebook/Board/")
                .build().create(Apicall.class);

        return apicall;
    }
}
