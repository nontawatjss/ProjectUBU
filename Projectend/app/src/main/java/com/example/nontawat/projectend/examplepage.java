package com.example.nontawat.projectend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class examplepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examplepage);


        Button bt01 = (Button)findViewById(R.id.button4);

        Intent intent = getIntent();
        String value = intent.getStringExtra("key"); //if it's a string you stored.

        System.out.println(value+"OKKKKK");



        bt01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Game01");

                Intent myIntent = new Intent(examplepage.this, game001.class);
                myIntent.putExtra("key", "Learn"); //Optional parameters
                startActivity(myIntent);

            }
        });
    }
}
