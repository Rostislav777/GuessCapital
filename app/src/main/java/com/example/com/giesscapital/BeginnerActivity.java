package com.example.com.giesscapital;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BeginnerActivity extends Activity {
    public static final String key = "key1";
    static int[] BeginnerState = new int[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beginner_layout);


    }

    public void KievOn(View view){
        BeginnerState[0] = 1;
        Intent intent = new Intent(this, BeginnerActivity_st2.class);
        startActivity(intent);
    }
    public void LvivOn(View view){
        BeginnerState[0] = 0;
        Intent intent = new Intent(this, BeginnerActivity_st2.class);
        startActivity(intent);
    }
    public void KharkivOn(View view){
        BeginnerState[0] = 0;
        Intent intent = new Intent(this, BeginnerActivity_st2.class);
        startActivity(intent);
    }

}
