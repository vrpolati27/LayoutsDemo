package com.m1m2.layoutsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.m1m2.layoutsdemo.model.Preferences;

public class Task3Activity extends AppCompatActivity {

    private StringBuilder buffer = new StringBuilder("");
    private EditText screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);
        screen = (EditText) findViewById(R.id.display);

        ViewGroup group = (ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content);
        Preferences.setAllTextView(group,this);
    }

    public void buttonPressed(View view){

        switch (view.getId()){
            case R.id.button_0:
                   updateBuffer("0");
                break;
            case R.id.button_1:
                updateBuffer("1");
                break;
            case R.id.button_2:
                updateBuffer("2");
                break;
            case R.id.button_3:
                updateBuffer("3");
                break;
            case R.id.button_4:
                updateBuffer("4");
                break;
            case R.id.button_5:
                updateBuffer("5");
                break;
            case R.id.button_6:
                updateBuffer("6");
                break;
            case R.id.button_7:
                updateBuffer("7");
                break;
            case R.id.button_8:
                updateBuffer("8");
                break;
            case R.id.button_9:
                updateBuffer("9");
                break;
            case R.id.button_period:
                updateBuffer(".");
                break;
            case R.id.button_plus:
                updateBuffer("+");
                break;
            case R.id.button_minus:
                updateBuffer("-");
                break;
            case R.id.button_asteric:
                updateBuffer("*");
                break;
            case R.id.button_divide:
                updateBuffer("/");
                break;
            case R.id.button_equals:

            default:
                screen.setText("oops! this is not implemented");
                break;
        }
    }


    private void updateBuffer(String buffer1){

        if(!buffer.equals("oops! this is not implemented")){
            buffer.append(buffer1);
        }else{
            buffer = buffer.replace(0,buffer.length(),"");
        }
         screen.setText(buffer);
    }
}
