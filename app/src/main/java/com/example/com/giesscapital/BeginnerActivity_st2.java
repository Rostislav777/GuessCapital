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
        BeginnerState[0] = 1;
        Intent qwe = new Intent(this, BeginnerActivity_st2.class);
        startActivity(qwe);
    }
    public void LondonOn(View view){
        BeginnerState[0] = 0;
        Intent intent = new Intent(this, BeginnerActivity_st2.class);
        startActivity(intent);
    }
    public void RomeOn(View view){
        BeginnerState[0] = 0;
        Intent intent = new Intent(this, BeginnerActivity_st2.class);
        startActivity(intent);
    }
}
