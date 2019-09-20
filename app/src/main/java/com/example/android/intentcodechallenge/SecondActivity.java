package com.example.android.intentcodechallenge;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        textView = (TextView) findViewById(R.id.text);
        Intent intentT1 = getIntent();
        String textDisplayed1 =intentT1.getStringExtra(MainActivity.EXTRA_DISPLAY1);
        textView.setText(textDisplayed1);

        Intent intentT2 = getIntent();
        String textDisplayed2 =intentT2.getStringExtra(MainActivity.EXTRA_DISPLAY2);
        textView.setText(textDisplayed2);

        Intent intentT3 = getIntent();
        String textDisplayed3 =intentT3.getStringExtra(MainActivity.EXTRA_DISPLAY3);
        textView.setText(textDisplayed3);
    }
}
