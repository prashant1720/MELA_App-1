package com.example.prashant.mela_money;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private Madapter madapter;
    private List<Mevent> eventList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Mevent[] mevents = new Mevent[]
                {
                        new Mevent("Technical Event:Eroor finding", "Finding the error", "50rs"),


                        new Mevent("Technical Event:Inside Out", "Animation", "60rs"),


                        new Mevent("Technical Event:Eroor finding", "Finding the error", "50rs"),


                        new Mevent("Technical Event:", "Finding the error", "50rs"),


                        new Mevent("Technical Event:", "Finding the error", "50rs"),
//non technical event
                        new Mevent("NONTECHNICAL Event:", "Finding the error", "50rs"),

                        new Mevent("NONTECHNICAL Event:", "Finding the error", "30rs"),
                        new Mevent("NONTECHNICAL Event:", "Finding the error", "40rs"),
                        new Mevent("NONTECHNICAL Event:", "Finding the error", "30rs"),
                        new Mevent("NONTECHNICAL Event:", "Finding the error", "50rs"),

                };

        RecyclerView recyclerView =  findViewById(R.id.recyclerview);

        Madapter adapter = new Madapter(Arrays.asList(mevents));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);


    }


}
