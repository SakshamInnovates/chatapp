package com.example.chatapp;



import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
             Intent intent =new Intent(splash.this, login.class);
             startActivity(intent);
                    finish();
                }


            },4000);

        }
    }
