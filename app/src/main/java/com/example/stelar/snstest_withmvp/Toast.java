package com.example.stelar.snstest_withmvp;

import android.content.Context;

/**
 * Created by Stelar on 2016-07-25.
 */
public class Toast {

    public static void ToastMessage(Context context,String message){
        android.widget.Toast.makeText(context,message, android.widget.Toast.LENGTH_SHORT).show();
    }
}
