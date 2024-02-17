package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.zegocloud.zimkit.services.ZIMKit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initzcloud();
        startActivity(new Intent(this,LoginActivity.class));
        finish();
    }

    public void initzcloud(){
        ZIMKit.initWith(this.getApplication(),KeyConstant.appId,KeyConstant.appSign);
        ZIMKit.initNotifications();
    }
}