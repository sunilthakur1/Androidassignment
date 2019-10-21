package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class radioimg extends AppCompatActivity implements View.OnClickListener {
    RadioButton radiobutton1,radiobutton2,radiobutton3,radiobutton4;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radioimg);

        radiobutton1 = findViewById(R.id.rad1);
        radiobutton2 = findViewById(R.id.rad2);
        radiobutton3 = findViewById(R.id.rad3);
        radiobutton4 = findViewById(R.id.rad4);
        imageView = findViewById(R.id.image);


        radiobutton1.setOnClickListener(this);
        radiobutton2.setOnClickListener(this);
        radiobutton3.setOnClickListener(this);
        radiobutton4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rad1:
                imageView.setImageResource(R.drawable.earth1);
                break;
            case R.id.rad2:
                imageView.setImageResource(R.drawable.earth2);
                break;
            case R.id.rad3:
                imageView.setImageResource(R.drawable.one);
                break;
            case R.id.rad4:
                imageView.setImageResource(R.drawable.six);
                break;
    }
}}
