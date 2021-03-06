package com.preethi.ac17_workshop;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button questionButton = (Button) findViewById(R.id.question_button);
        questionButton.setOnClickListener(this);
        Button pictureButton = (Button) findViewById(R.id.picture_button);
        pictureButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.question_button)
        { startActivity(new Intent(MainActivity.this,QuestionActivity.class));

        }
        else if (v.getId() == R.id.picture_button)
        {
            startActivity(new Intent(MainActivity.this,PictureActivity.class));

        }
    }
}
