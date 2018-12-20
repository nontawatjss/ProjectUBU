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

        Button BTlearn = (Button)findViewById(R.id.btlearn);
        Button BTgame = (Button)findViewById(R.id.btgame);
        Button BTscore = (Button)findViewById(R.id.btscore);


        //LearnButton
        BTlearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("CLick learn");

                Intent myIntent = new Intent(MainActivity.this, learnpage.class);
                myIntent.putExtra("key", "Learn"); //Optional parameters
                startActivity(myIntent);
            }
        });

        //GameButton
        BTgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("CLick game");

                Intent myIntent = new Intent(MainActivity.this, examplepage.class);
                myIntent.putExtra("key", "Game"); //Optional parameters
                startActivity(myIntent);
            }
        });

        //ScoreButton
        BTscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("CLick game");

                Intent myIntent = new Intent(MainActivity.this, scorepage.class);
                myIntent.putExtra("key", "Score"); //Optional parameters
                startActivity(myIntent);
            }
        });
    }




}
