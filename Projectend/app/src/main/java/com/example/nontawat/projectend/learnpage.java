package com.example.nontawat.projectend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class learnpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_learnpage);

        Intent intent = getIntent();
        String value = intent.getStringExtra("key"); //if it's a string you stored.


    }
}
