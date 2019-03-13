package com.example.prashant.mela_money;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        String value = Madapter.event_Name;
        TextView apple = findViewById(R.id.eventtitle);
        apple.setText(value);
    }

    public void Button(View view) {
        Intent intent=new Intent(getApplicationContext(),Payment.class);
        startActivity(intent);


    }
}
