package com.example.garageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class carActivity2 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car2);

        item clickedItem = (item) getIntent().getSerializableExtra("clicked_item");

        String carName = clickedItem.getName();
        String carYear = clickedItem.getMake();
        String carPrice = clickedItem.getPrice();
        int carImage = clickedItem.getImage();

        TextView carNameView = findViewById(R.id.carNameView);
        TextView carYearView = findViewById(R.id.carYearView);
        TextView carPriceView = findViewById(R.id.carPriceView);
        ImageView carImageView = findViewById(R.id.carImageView);

        carNameView.setText(carName);
        carYearView.setText(carYear);
        carPriceView.setText(carPrice);
        carImageView.setImageResource(carImage);
    }
}