package com.m1m2.layoutsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.m1m2.layoutsdemo.model.Preferences;

public class MainActivity extends AppCompatActivity {

    private TextView developer;
    private TextView courseEnrolledFor;
    private TextView schoolName;
    private ImageView me;
    private Button task1;
    private Button task2;
    private Button task3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        developer = (TextView) findViewById(R.id.tv_developer_name);
        developer.setText(String.format("%-14s","Developer")+":"+developer.getText());/*Format String*/

        courseEnrolledFor = (TextView)findViewById(R.id.tv_course);
        courseEnrolledFor.setText(String.format("%-14s","Course Number")+":"+courseEnrolledFor.getText());

        schoolName = (TextView) findViewById(R.id.tv_school_name);
        schoolName.setText(String.format("%-15s","School")+":"+schoolName.getText());

        me = (ImageView) findViewById(R.id.img_me);
        me.setImageDrawable(getResources().getDrawable(R.drawable.self));

        task1 = (Button) findViewById(R.id.button_task1);
        task1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  gotoNextActivity(1);
            }
        });

        task2 = (Button) findViewById(R.id.button_task2);
        task2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               gotoNextActivity(2);
            }
        });

        task3 = (Button) findViewById(R.id.button_task3);
        task3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoNextActivity(3);
            }
        });


        ViewGroup group = (ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content);
        Preferences.setAllTextView(group,this);
    }

    private void gotoNextActivity(int task){
           Intent intent = null;
        switch (task){
            case 1:
                intent = new Intent(this,Task2Activity.class);
                break;
            case 2:
                intent = new Intent(this,Task3Activity.class);
                break;
            default:
                intent = new Intent(this,Task4Activity.class);
                break;
        }
        startActivity(intent);

    }

}
