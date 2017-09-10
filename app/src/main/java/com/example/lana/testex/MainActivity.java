package com.example.lana.testex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView intValue;
    int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intValue = (TextView) findViewById(R.id.intValue);
    }

    public void increaseInteger(View view) {
        number += 1;
        intValue.setText("Integer : " + number);
    }

}


