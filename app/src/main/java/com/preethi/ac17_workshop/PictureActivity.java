package com.preethi.ac17_workshop;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class PictureActivity extends Activity implements OnClickListener {
   private ImageView imageView;
    private boolean changed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
        imageView = (ImageView) findViewById(R.id.image_view);
        imageView.setOnClickListener(this);
        changed = false;
    }

    @Override
    public void onClick(View v) {
        changed = !changed;
        if (changed) {
            imageView.setImageResource(R.drawable.incorgnito);

        } else {
            imageView.setImageResource(R.drawable.phone);

        }
    }
}
