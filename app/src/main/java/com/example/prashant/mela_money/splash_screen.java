package com.example.prashant.mela_money;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class splash_screen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;
    Handler handler;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
imageView=findViewById(R.id.imgLogo);
imageView.setAlpha(127);
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(splash_screen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
    }


