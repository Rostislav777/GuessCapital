package com.example.com.giesscapital;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class QuestionsActivity extends Activity {
    private Map<Integer, String> questionsMap = new HashMap<>();
    private int[] ExpertState = new int[10];
    private int numberQuestions = 0;
    private LinearLayout mLinearLayout;
    private TextView mInfoTextView;
    private Button  expertButton_1;
    private Button  expertButton_2;
    private Button  expertButton_3;

    {
        questionsMap.put(1, "Столица Китая?");
        questionsMap.put(2, "Столица Венгрии?");
        questionsMap.put(3, "Столица Украины");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions_layout);

        mLinearLayout = (LinearLayout) findViewById(R.id.linearLayout_img);
        mInfoTextView = (TextView) findViewById(R.id.textExpertQuestion);
        expertButton_1 = (Button) findViewById(R.id.buttonIdExpert_1);
        expertButton_2 = (Button) findViewById(R.id.buttonIdExpert_2);
        expertButton_3 = (Button) findViewById(R.id.buttonIdExpert_3);

        ExpertState[0] = 1;
    }

    public void onExpertButtonClick(View view) {

    }

   /* public void onExpertButtonClick(View view) {

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

      */
    }

