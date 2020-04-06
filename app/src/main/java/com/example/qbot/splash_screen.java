package com.example.qbot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash_screen extends AppCompatActivity {

    private static int SPLASE_TIMEOUT=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 Intent homeIntent=new Intent(splash_screen.this,login.class);
                 startActivity(homeIntent);
                 //overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                 finish();
             }
         },SPLASE_TIMEOUT);
    }
}
