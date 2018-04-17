package com.example.a16022970.p01_dailygoals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        String[] summary = i.getStringArrayExtra("summary");
        TextView tvSummary = (TextView) findViewById(R.id.textViewSummary);
        tvSummary.setText("Read up on materials before class: " + summary[0]
                + "\nArrive on time so as not to miss important part of the lesson: " + summary[1]
                + "\nAttempt the problem myself: " + summary[2]
                + "\nReflection: " + summary[3] );

    }
}
