package com.example.stelar.snstest_withmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainPresenter.UpdateView{

    MainPresenter mainPresenter;
    @BindView(R.id.Sign_message)
    EditText message;
    @BindView(R.id.Sign_post)
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mainPresenter = new MainPresenter(this);
    }

    @OnClick(R.id.Sign_post)
    public void idOnClick(){
        String a = message.getText().toString();
        mainPresenter.serverTodata(a);
    }

    @Override
    public void updateActivity(String code) {
        Toast.ToastMessage(MainActivity.this,code);
    }
}
