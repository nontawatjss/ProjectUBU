package com.example.nontawat.projectend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Test");

        Button button = (Button)findViewById(R.id.button2);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("CLick");

                Intent myIntent = new Intent(MainActivity.this, Main2Activity.class);
                myIntent.putExtra("key", "AA"); //Optional parameters
                startActivity(myIntent);
            }
        });
    }




}
