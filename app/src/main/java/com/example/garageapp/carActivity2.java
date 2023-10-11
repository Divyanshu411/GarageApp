package com.example.garageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class carActivity2 extends AppCompatActivity {
    FloatingActionButton fab_back, fab_home;

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

        //Floating button - Back
        fab_back = findViewById(R.id.fab_back);
        fab_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //Floating button - Home
        fab_home = findViewById(R.id.fab_home);
        fab_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void action_ads(View view){
        Uri uri_web = Uri.parse("https://www.google.com");
        Intent intent_show_web = new Intent(Intent.ACTION_VIEW, uri_web);

        try{
            startActivity(intent_show_web);
        }catch(ActivityNotFoundException e){
            e.printStackTrace();
        }
    }
}