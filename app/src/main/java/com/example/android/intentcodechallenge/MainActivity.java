package com.example.android.intentcodechallenge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    public static final int TEXT_REQUEST1 = 1;
    public static final int TEXT_REQUEST2 = 2;
    public static final int TEXT_REQUEST3 = 3;
    public static final String EXTRA_DISPLAY1 = "com.example.android.intentcodechallenge.EXTRA.display1";
    public static final String EXTRA_DISPLAY2 = "com.example.android.intentcodechallenge.EXTRA.display2";
    public static final String EXTRA_DISPLAY3 = "com.example.android.intentcodechallenge.EXTRA.display3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentT1 = new Intent(v.getContext(), SecondActivity.class);
                String text1 = getString(R.string.text_one);
                intentT1.putExtra(EXTRA_DISPLAY3, text1);
                startActivityForResult(intentT1, TEXT_REQUEST1);
            }
        });
        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentT2 = new Intent(v.getContext(), SecondActivity.class);
                String text2 = getString(R.string.text_two);
                intentT2.putExtra(EXTRA_DISPLAY3, text2);
                startActivityForResult(intentT2, TEXT_REQUEST2);
            }
        });


        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentT3 = new Intent(v.getContext(), SecondActivity.class);
                String text3 = getString(R.string.text_three);
                intentT3.putExtra(EXTRA_DISPLAY3, text3);
                startActivityForResult(intentT3, TEXT_REQUEST3);
            }
        });

    }


}
