package com.b.recyclerviewconcept2_main;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ClickView extends AppCompatActivity {

    ImageView img;
    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_view);

        img = (ImageView) findViewById(R.id.desc_img);
        tv1 = (TextView) findViewById(R.id.desc_header);
        tv2 = (TextView) findViewById(R.id.desc_desc);

        img.setImageResource(getIntent().getIntExtra("imagename",0));
        tv1.setText(getIntent().getStringExtra("header"));
        tv2.setText(getIntent().getStringExtra("desc"));
    }
}