package com.example.garageapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class carsActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);

        RecyclerView rv = findViewById(R.id.carRecyclerView);

        List<item> carList = new ArrayList<>();
        carList.add(new item("Toyota Camry", 2023, "€25,000", R.drawable.a));
        carList.add(new item("Ford F-150", 2023, "€30,000", R.drawable.b));
        carList.add(new item("Honda Civic", 2023, "€22,000", R.drawable.c));
        carList.add(new item("Chevrolet Silverado", 2023, "€30,000", R.drawable.d));
        carList.add(new item("Mercedes-Benz E-Class", 2023, "€55,000", R.drawable.e));
        carList.add(new item("Volkswagen Golf", 2023, "€23,000", R.drawable.f));
        carList.add(new item("BMW 3 Series", 2023, "€40,000", R.drawable.g));
        carList.add(new item("Tesla Model 3", 2023, "€40,000", R.drawable.h));
        carList.add(new item("Nissan Rogue", 2023, "€25,000 ", R.drawable.i));
        carList.add(new item("Audi Q5", 2023, "€45,000", R.drawable.j));



        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new carAdapter(getApplicationContext(), carList));
    }
}