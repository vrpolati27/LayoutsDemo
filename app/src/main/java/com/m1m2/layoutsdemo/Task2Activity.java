package com.m1m2.layoutsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

import com.m1m2.layoutsdemo.model.Preferences;

public class Task2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);

        ViewGroup group = (ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content);
        Preferences.setAllTextView(group,this);
    }
}
