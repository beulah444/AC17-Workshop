package com.preethi.ac17_workshop;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class QuestionActivity extends Activity  implements OnClickListener {

    private EditText textField;
    private TextView answerLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        Button submitButton = (Button) findViewById(R.id.submit_button);
        submitButton.setOnClickListener(this);

        textField = (EditText) findViewById(R.id.text_field);
        answerLabel = (TextView) findViewById(R.id.answer_label);
    }

    @Override
    public void onClick(View v) {

        if (textField.getText().toString().equals("42")) {
            answerLabel.setText(R.string.answer_label_correct);
            answerLabel.setTextColor(Color.rgb(0,192,0));
        } else {
            answerLabel.setText(R.string.answer_label_incorrec);
            answerLabel.setTextColor(Color.rgb(255,0,0));
        }
    }
}
