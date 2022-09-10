package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class important extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_important);
        Button button4 =findViewById(R.id.button4);
        Button button2 =findViewById(R.id.button2);
        Button button3 =findViewById(R.id.button3);
    }
}