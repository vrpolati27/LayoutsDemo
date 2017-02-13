package com.m1m2.layoutsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;

import com.m1m2.layoutsdemo.model.Preferences;

public class Task4Activity extends AppCompatActivity {

    private SeekBar seekBar;
    private ImageView developerImg;
    private static String TAG_LOGCAT = "Task4Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task4);
        initializeVariables();
        setImageParameters();
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.d(TAG_LOGCAT,"onProgressChange()");
                setImageParameters();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d(TAG_LOGCAT,"onStartTrackingTouch()");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d(TAG_LOGCAT,"onStopTrackingTouch");
            }
        });
        ViewGroup group = (ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content);
        Preferences.setAllTextView(group,this);
    }

    private void initializeVariables(){
        seekBar = (SeekBar) findViewById(R.id.seekbar);
        developerImg = (ImageView) findViewById(R.id.img_me2);
    }

    /* change ImageView height and width depending on seekbar progress*/
    private void setImageParameters(){
        float fractor = (seekBar.getProgress()/(float)seekBar.getMax());
        developerImg.getLayoutParams().height = (int)(1000*fractor);
        developerImg.getLayoutParams().width = (int)(1000*fractor);
        developerImg.requestLayout();
        Log.i(TAG_LOGCAT,"setImgParameter() height:"+developerImg.getLayoutParams().height+"");
    }
}
