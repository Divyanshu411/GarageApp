package com.example.garageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton cars, bikes, others;
    Button Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cars = findViewById(R.id.rdb_car);
        bikes = findViewById(R.id.rdb_bike);
        others = findViewById(R.id.rdb_others);

        Btn = findViewById(R.id.startBtn);
        Btn.setOnClickListener(view -> {
            Intent Btn = new Intent(MainActivity.this, carActivity.class);
            startActivity(Btn);
        });
    }
}