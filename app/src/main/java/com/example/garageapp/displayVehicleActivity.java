package com.example.garageapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class displayVehicleActivity extends AppCompatActivity implements RecyclerViewInterface{
    FloatingActionButton fab_home1;
    private List<item> itemList;
    RecyclerView rv;
    vehicleAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_vehicle);

        rv = findViewById(R.id.carRecyclerView);

        Intent intent = getIntent();
        String vehicleType = intent.getStringExtra("vehicle_type");
        assert vehicleType != null;
        itemList = getVehicleData(vehicleType);

        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new vehicleAdapter(getApplicationContext(), itemList, this);
        rv.setAdapter(adapter);
    }

    private List<item> getVehicleData(String vehicleType){
        itemList = new ArrayList<>();

        switch (vehicleType) {
            case "Cars":
                itemList.add(new item("Audi Q5", "2023", "€45,000", R.drawable.j));
                itemList.add(new item("BMW 3 Series", "2019", "€40,000", R.drawable.g));
                itemList.add(new item("Chevrolet Silverado", "2020", "€30,000", R.drawable.d));
                itemList.add(new item("Ford F-150", "2022", "€30,000", R.drawable.b));
                itemList.add(new item("Honda Civic", "2021", "€22,000", R.drawable.c));
                itemList.add(new item("Mercedes-Benz E-Class", "2028", "€55,000", R.drawable.e));
                itemList.add(new item("Nissan Rogue", "2017", "€25,000", R.drawable.i));
                itemList.add(new item("Tesla Model 3", "2019", "€40,000", R.drawable.h));
                itemList.add(new item("Toyota Camry", "2020", "€25,000", R.drawable.a));
                itemList.add(new item("Volkswagen Golf", "2023", "€23,000", R.drawable.f));
                break;
            case "Bikes":
                itemList.add(new item("Harley-Davidson Street Glide", "2020", "€30,000", R.drawable.b1));
                itemList.add(new item("BMW R1250GS Adventure", "2022", "€22,000", R.drawable.b2));
                itemList.add(new item("Ducati Panigale V4", "2019", "€28,500", R.drawable.b3));
                itemList.add(new item("Honda Gold Wing", "2018", "€28,300", R.drawable.b4));
                itemList.add(new item("Kawasaki Ninja ZX-10R", "2021", "€17,000", R.drawable.b5));
                itemList.add(new item("Suzuki Hayabusa", "2021", "€18,500", R.drawable.b6));
                itemList.add(new item("Yamaha YZF-R1", "2020", "€17,700", R.drawable.b7));
                itemList.add(new item("Triumph Tiger 900", "2023", "€14,500", R.drawable.b8));
                itemList.add(new item("KTM 1290 Super Duke R", "2018", "€19,500", R.drawable.b9));
                itemList.add(new item("Indian Challenger", "2023", "€23,000", R.drawable.b10));
                break;
            case "Others":
                itemList.add(new item("Oil Filter", "2020", "10 euro", R.drawable.p1));
                itemList.add(new item("Spark Plugs", "2023", "7 euro", R.drawable.p2));
                itemList.add(new item("Brake Rotors", "2017", "25 euro", R.drawable.p3));
                itemList.add(new item("Air Filter", "2018", "12 euro", R.drawable.p4));
                itemList.add(new item("Ignition Coil", "2020", "15 euro", R.drawable.p5));
                itemList.add(new item("Brake Pads", "2023", "20 euro", R.drawable.p6));
                itemList.add(new item("Chain", "2021", "15 euro", R.drawable.p7));
                itemList.add(new item("Tire Tubes", "2022", "10 euro", R.drawable.p8));
                itemList.add(new item("Pedals", "2019", "8 euro", R.drawable.p9));
                itemList.add(new item("Saddle", "2022", "25 euro", R.drawable.p10));
                break;
        }
        return itemList;
    }

    @Override
    public void onItemClick(int position) {
        item clickedItem = itemList.get(position);
        Intent intent = new Intent(displayVehicleActivity.this, displayVehicleActivity2.class);

        intent.putExtra("clicked_item", clickedItem);

        startActivity(intent);

        //Floating button - Home
        fab_home1 = findViewById(R.id.fab_home1);
        fab_home1.setOnClickListener(v -> {
            Intent intent1 = new Intent(displayVehicleActivity.this, MainActivity.class);
            startActivity(intent1);
        });
    }
}