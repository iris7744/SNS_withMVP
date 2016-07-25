package com.example.stelar.snstest_withmvp;

import android.content.Context;

/**
 * Created by Stelar on 2016-07-25.
 */
public class MainPresenter {

    UpdateView updateView;

    public MainPresenter(UpdateView view) {
        updateView = view;
    }

    public void serverTodata(String message){
        MainModel.sharedInstance().connectServer(message, new MainModel.PostResult() {
            @Override
            public void getcodeToserver(int code) {
                updateView.updateActivity(String.valueOf(code));
            }

            @Override
            public void getErrorMessage(String message) {
                updateView.updateActivity(message);
            }
        });
    }

    public interface UpdateView {
        void updateActivity(String code);
    }
}
