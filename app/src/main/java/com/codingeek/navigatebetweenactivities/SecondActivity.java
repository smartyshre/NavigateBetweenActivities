package com.codingeek.navigatebetweenactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.codingeek.navigatebetweenactivities.R;

public class SecondActivity extends AppCompatActivity {

    TextView secondActivityText;
    Bundle receivedBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        secondActivityText = (TextView) findViewById(R.id.secondActivityText);
        receivedBundle = getIntent().getExtras();
        String receivedMessage = receivedBundle.getString("key");
        Toast.makeText(this, receivedMessage, Toast.LENGTH_LONG).show();
    }
}
