package com.example.thecounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Welcome;
    TextView Number;
    Button ClickMe;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Welcome=findViewById(R.id.idTVWelcome);
        ClickMe=findViewById(R.id.idBtnClickMe);
        Number=findViewById(R.id.idTVWNumber);

        ClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number.setText(""+increaseCounter());

            }
        });

    }
    public int increaseCounter(){
        return counter++;
    }
}