package com.codingeek.navigatebetweenactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button toSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toSecondActivity = (Button) findViewById(R.id.buttonToActivity);

        toSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toActivity = new Intent(MainActivity.this, SecondActivity.class);
                toActivity.putExtra("key", "This is the message from MainActivity");
                startActivity(toActivity);
            }
        });
    }
}
