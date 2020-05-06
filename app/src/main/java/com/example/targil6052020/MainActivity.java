package com.example.targil6052020;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
 ToggleButton tb;
 Switch sw;
 Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn);
        sw=(Switch)findViewById(R.id.sw);
        tb=(ToggleButton)findViewById(R.id.tb);
    }
    public void setMyScreenColor(int color){
        View view =this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }

    public void go(View view) {
        if((tb.isChecked())&&(sw.isChecked())){
            setMyScreenColor(Color.GREEN);
        }
        if((tb.isChecked())&&(sw.isChecked()==false)){
            setMyScreenColor(Color.RED);
        }
        if((tb.isChecked()==false)&&(sw.isChecked()==false)){
            setMyScreenColor(Color.BLUE);
        }
        if ((tb.isChecked()==false)&&(sw.isChecked())){
            setMyScreenColor(Color.YELLOW);
        }
    }
}
