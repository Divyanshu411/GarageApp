package com.example.garageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.bumptech.glide.Glide;

public class displayVehicleActivity2 extends AppCompatActivity {
    FloatingActionButton fab_back, fab_home, fab_ads;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_vehicle2);

        Item clickedItem = (Item) getIntent().getSerializableExtra("clicked_item");

        assert clickedItem != null;
        String itemName = clickedItem.getName();
        String itemYear = clickedItem.getYear();
        String itemPrice = clickedItem.getPrice();
        String itemImageUrl = clickedItem.getImageUrl();
        String itemAdsUrl = clickedItem.getItemAdUrl();

        TextView itemNameView = findViewById(R.id.itemNameView);
        TextView itemYearView = findViewById(R.id.itemYearView);
        TextView itemPriceView = findViewById(R.id.itemPriceView);
        ImageView itemImageView = findViewById(R.id.itemImageView);

        itemNameView.setText(itemName);
        itemYearView.setText(itemYear);
        itemPriceView.setText(itemPrice);

        Glide.with(this)
                .load(itemImageUrl) // Load the image URL
                .into(itemImageView);

        // Floating button - Back
        fab_back = findViewById(R.id.fab_back);
        fab_back.setOnClickListener(v -> finish());

        // Floating button - Home
        fab_home = findViewById(R.id.fab_home);
        fab_home.setOnClickListener(v -> {
            Intent intent = new Intent(displayVehicleActivity2.this, MainActivity.class);
            startActivity(intent);
        });

        // Floating button - Ads
        fab_ads = findViewById(R.id.fab_ads);
        Uri uri_web = Uri.parse(itemAdsUrl);
        Intent intent_show_web = new Intent(Intent.ACTION_VIEW, uri_web);

        fab_ads.setOnClickListener(v -> {
            try {
                startActivity(intent_show_web);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
                // Handle the exception if a web browser is not found on the device.
            }
        });
    }
}
