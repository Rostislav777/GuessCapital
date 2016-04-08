package com.example.com.giesscapital;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends Activity {

    Button expertButton_1;
    Button expertButton_2;
    Button expertButton_3;
    GameLevel gameLevel;

    {
        expertButton_1 = (Button) findViewById(R.id.buttonIdExpert_1);
        expertButton_2 = (Button) findViewById(R.id.buttonIdExpert_2);
        expertButton_3 = (Button) findViewById(R.id.buttonIdExpert_3);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    public void startGame() {
        if (expertButton_1.getText().toString().equals(GameLevel.LOW.toString()))
            gameLevel = GameLevel.LOW;
        else if (expertButton_1.getText().toString().equals(GameLevel.MEDIUM.toString()))
            gameLevel = GameLevel.MEDIUM;
        else
            gameLevel = GameLevel.HARD;

    }
}
