package com.example.com.giesscapital;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BeginnerActivity_st2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beginner_layout_2);
    }

    public void ParisOn(View view){
        BeginnerActivity.BeginnerState[1] = 0;
        Intent qwe = new Intent(this, BeginnerActivity_st2.class);
        startActivity(qwe);
    }
    public void LondonOn(View view){
        BeginnerActivity.BeginnerState[1] = 1;
        Intent intent = new Intent(this, BeginnerActivity_st2.class);
        startActivity(intent);
    }
    public void RomeOn(View view){
        BeginnerActivity.BeginnerState[0] = 0;
        Intent intent = new Intent(this, BeginnerActivity_st2.class);
        startActivity(intent);
    }
}
