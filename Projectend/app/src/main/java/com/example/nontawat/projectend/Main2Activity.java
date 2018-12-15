package com.example.nontawat.projectend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String value = intent.getStringExtra("key"); //if it's a string you stored.


    }
}
