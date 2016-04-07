package com.example.com.giesscapital;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ExpertActivity extends Activity {
    private int[] ExpertState = new int[10];

    private int numberQuestions = 0;

    private LinearLayout mLinearLayout;
    private TextView mInfoTextView;
    private Button  expertButton_1;
    private Button  expertButton_2;
    private Button  expertButton_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expert_layout);

        mLinearLayout = (LinearLayout) findViewById(R.id.linearLayout_img);
        mInfoTextView = (TextView) findViewById(R.id.textExpertQuestion);
        expertButton_1 = (Button) findViewById(R.id.buttonIdExpert_1);
        expertButton_2 = (Button) findViewById(R.id.buttonIdExpert_2);
        expertButton_3 = (Button) findViewById(R.id.buttonIdExpert_3);

        ExpertState[0] = 1;
    }

    public void onExpertButtonClick(View view) {

        numberQuestions ++;

        if (numberQuestions == 1) {

            mInfoTextView.setText(R.string.expert_question_2);

            final int sdk = android.os.Build.VERSION.SDK_INT;
            if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                mLinearLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.norway));
            } else {
                mLinearLayout.setBackground(getResources().getDrawable(R.drawable.norway));
            }

            expertButton_1.setText("Helsinki");
            expertButton_2.setText("Madrid");
            expertButton_3.setText("Oslo");

        }

        else if (numberQuestions == 2) {

            mInfoTextView.setText(R.string.expert_question_3);

            final int sdk = android.os.Build.VERSION.SDK_INT;
            if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                mLinearLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.argentina));
            } else {
                mLinearLayout.setBackground(getResources().getDrawable(R.drawable.argentina));
            }

            expertButton_1.setText("Buenos Aires");
            expertButton_2.setText("Mexico");
            expertButton_3.setText("Caracas");
        }

        else if (numberQuestions == 3) {

            mInfoTextView.setText(R.string.expert_question_4);

            final int sdk = android.os.Build.VERSION.SDK_INT;
            if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                mLinearLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.australia));
            } else {
                mLinearLayout.setBackground(getResources().getDrawable(R.drawable.australia));
            }

            expertButton_1.setText("Sydney");
            expertButton_2.setText("Melbourne");
            expertButton_3.setText("Canberr");
        }
    }
}
