package com.example.garageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioButton cars, bikes, others;
    Button Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup group = findViewById(R.id.radioGroup);
        cars = findViewById(R.id.rdb_car);
        bikes = findViewById(R.id.rdb_bike);
        others = findViewById(R.id.rdb_others);

        Btn = findViewById(R.id.startBtn);
        Btn.setOnClickListener(view -> {
            Intent Btn = new Intent(MainActivity.this, displayVehicleActivity.class);
            startActivity(Btn);
        });

        Btn.setOnClickListener(view -> {
            int selectedId = group.getCheckedRadioButtonId();
            String vehicleType = null;

            if(selectedId == cars.getId()){
                vehicleType = "Cars";
            } else if (selectedId == bikes.getId()) {
                vehicleType = "Bikes";
            } else if (selectedId == others.getId()) {
                vehicleType = "Others";
            }else
                vehicleType = "Cars";

            Intent intent = new Intent(MainActivity.this, displayVehicleActivity.class);
            intent.putExtra("vehicle_type", vehicleType);
            startActivity(intent);
        });
    }
}