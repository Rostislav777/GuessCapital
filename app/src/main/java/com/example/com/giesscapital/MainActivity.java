package com.example.com.giesscapital;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }
    public void goToBeginnerActivity(View view){
        Intent intent = new Intent(this, BeginnerActivity.class);
        startActivity(intent);
    }

    public void goToExpertActivity(View view) {
        Intent intent = new Intent(this, ExpertActivity.class);
        startActivity(intent);
    }
}
