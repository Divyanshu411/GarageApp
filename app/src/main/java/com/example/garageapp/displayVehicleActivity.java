package com.example.garageapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class displayVehicleActivity extends AppCompatActivity implements RecyclerViewInterface{
    FloatingActionButton fab_home1;
    private List<Item> itemList;
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

    @SuppressLint("DiscouragedApi")
    private List<Item> getVehicleData(String vehicleType){
        itemList = new ArrayList<>();

        switch (vehicleType) {
            case "Cars":
                itemList.add(new Item(  getString(R.string.audi_q5),
                        getString(R.string.audi_q5_year),
                        getString(R.string.audi_q5_price),
                        getString(R.string.audi_q5_image_url),
                        getString(R.string.audi_q5_ads_url)));
                itemList.add(new Item(getString(R.string.bmw_3_series),
                        getString(R.string.bmw_3_series_year),
                        getString(R.string.bmw_3_series_price),
                        getString(R.string.bmw_3_series_image_url),
                        getString(R.string.bmw_3_series_ads_url)));
                itemList.add(new Item(getString(R.string.chevrolet_silverado),
                        getString(R.string.chevrolet_silverado_year),
                        getString(R.string.chevrolet_silverado_price),
                        getString(R.string.chevrolet_silverado_image_url),
                        getString(R.string.chevrolet_silverado_ads_url)));
                itemList.add(new Item(getString(R.string.ford_f150_name),
                        getString(R.string.ford_f150_year),
                        getString(R.string.ford_f150_price),
                        getString(R.string.ford_f150_image_url),
                        getString(R.string.ford_f150_ads_url)));
                itemList.add(new Item(getString(R.string.honda_civic_name),
                        getString(R.string.honda_civic_year),
                        getString(R.string.honda_civic_price),
                        getString(R.string.honda_civic_image_url),
                        getString(R.string.honda_civic_ads_url)));
                itemList.add(new Item(getString(R.string.mercedes_e_class_name),
                        getString(R.string.mercedes_e_class_year),
                        getString(R.string.mercedes_e_class_price),
                        getString(R.string.mercedes_e_class_image_url),
                        getString(R.string.mercedes_e_class_ads_url)));
                itemList.add(new Item(getString(R.string.nissan_rogue_name),
                        getString(R.string.nissan_rogue_year),
                        getString(R.string.nissan_rogue_price),
                        getString(R.string.nissan_rogue_image_url),
                        getString(R.string.nissan_rogue_ads_url)));
                itemList.add(new Item(getString(R.string.tesla_model3_name),
                        getString(R.string.tesla_model3_year),
                        getString(R.string.tesla_model3_price),
                        getString(R.string.tesla_model3_image_url),
                        getString(R.string.tesla_model3_ads_url)));
                itemList.add(new Item(getString(R.string.toyota_camry_name),
                        getString(R.string.toyota_camry_year),
                        getString(R.string.toyota_camry_price),
                        getString(R.string.toyota_camry_image_url),
                        getString(R.string.toyota_camry_ads_url)));
                itemList.add(new Item(getString(R.string.volkswagen_golf_name),
                        getString(R.string.volkswagen_golf_year),
                        getString(R.string.volkswagen_golf_price),
                        getString(R.string.volkswagen_golf_image_url),
                        getString(R.string.volkswagen_golf_ads_url)));

                break;
            case "Bikes":
                itemList.add(new Item(getString(R.string.harley_davidson_street_glide_name),
                        getString(R.string.harley_davidson_street_glide_year),
                        getString(R.string.harley_davidson_street_glide_price),
                        getString(R.string.harley_davidson_street_glide_image_url),
                        getString(R.string.harley_davidson_street_glide_ads_url)));
                itemList.add(new Item(getString(R.string.bmw_r1250gs_adventure_name),
                        getString(R.string.bmw_r1250gs_adventure_year),
                        getString(R.string.bmw_r1250gs_adventure_price),
                        getString(R.string.bmw_r1250gs_adventure_image_url),
                        getString(R.string.bmw_r1250gs_adventure_ads_url)));
                itemList.add(new Item(getString(R.string.ducati_panigale_v4_name),
                        getString(R.string.ducati_panigale_v4_year),
                        getString(R.string.ducati_panigale_v4_price),
                        getString(R.string.ducati_panigale_v4_image_url),
                        getString(R.string.ducati_panigale_v4_ads_url)));
                itemList.add(new Item(getString(R.string.honda_gold_wing_name),
                        getString(R.string.honda_gold_wing_year),
                        getString(R.string.honda_gold_wing_price),
                        getString(R.string.honda_gold_wing_image_url),
                        getString(R.string.honda_gold_wing_ads_url)));
                itemList.add(new Item(getString(R.string.kawasaki_ninja_zx10r_name),
                        getString(R.string.kawasaki_ninja_zx10r_year),
                        getString(R.string.kawasaki_ninja_zx10r_price),
                        getString(R.string.kawasaki_ninja_zx10r_image_url),
                        getString(R.string.kawasaki_ninja_zx10r_ads_url)));
                itemList.add(new Item(getString(R.string.suzuki_hayabusa_name),
                        getString(R.string.suzuki_hayabusa_year),
                        getString(R.string.suzuki_hayabusa_price),
                        getString(R.string.suzuki_hayabusa_image_url),
                        getString(R.string.suzuki_hayabusa_ads_url)));
                itemList.add(new Item(getString(R.string.yamaha_yzf_r1_name),
                        getString(R.string.yamaha_yzf_r1_year),
                        getString(R.string.yamaha_yzf_r1_price),
                        getString(R.string.yamaha_yzf_r1_image_url),
                        getString(R.string.yamaha_yzf_r1_ads_url)));
                itemList.add(new Item(getString(R.string.triumph_tiger_900_name),
                        getString(R.string.triumph_tiger_900_year),
                        getString(R.string.triumph_tiger_900_price),
                        getString(R.string.triumph_tiger_900_image_url),
                        getString(R.string.triumph_tiger_900_ads_url)));
                itemList.add(new Item(getString(R.string.ktm_1290_super_duke_r_name),
                        getString(R.string.ktm_1290_super_duke_r_year),
                        getString(R.string.ktm_1290_super_duke_r_price),
                        getString(R.string.ktm_1290_super_duke_r_image_url),
                        getString(R.string.ktm_1290_super_duke_r_ads_url)));
                itemList.add(new Item(getString(R.string.indian_challenger_name),
                        getString(R.string.indian_challenger_year),
                        getString(R.string.indian_challenger_price),
                        getString(R.string.indian_challenger_image_url),
                        getString(R.string.indian_challenger_ads_url)));
                break;
            case "Others":
                itemList.add(new Item(
                        getString(R.string.oil_filter_name),
                        getString(R.string.oil_filter_year),
                        getString(R.string.oil_filter_price),
                        getString(R.string.oil_filter_image_url),
                        getString(R.string.oil_filter_ads_url)));
                itemList.add(new Item(
                        getString(R.string.spark_plugs_name),
                        getString(R.string.spark_plugs_year),
                        getString(R.string.spark_plugs_price),
                        getString(R.string.spark_plugs_image_url),
                        getString(R.string.spark_plugs_ads_url)));
                itemList.add(new Item(
                        getString(R.string.brake_rotors_name),
                        getString(R.string.brake_rotors_year),
                        getString(R.string.brake_rotors_price),
                        getString(R.string.brake_rotors_image_url),
                        getString(R.string.brake_rotors_ads_url)));
                itemList.add(new Item(
                        getString(R.string.air_filter_name),
                        getString(R.string.air_filter_year),
                        getString(R.string.air_filter_price),
                        getString(R.string.air_filter_image_url),
                        getString(R.string.air_filter_ads_url)));
                itemList.add(new Item(
                        getString(R.string.ignition_coil_name),
                        getString(R.string.ignition_coil_year),
                        getString(R.string.ignition_coil_price),
                        getString(R.string.ignition_coil_image_url),
                        getString(R.string.ignition_coil_ads_url)));
                itemList.add(new Item(
                        getString(R.string.brake_pads_name),
                        getString(R.string.brake_pads_year),
                        getString(R.string.brake_pads_price),
                        getString(R.string.brake_pads_image_url),
                        getString(R.string.brake_pads_ads_url)));
                itemList.add(new Item(
                        getString(R.string.chain_name),
                        getString(R.string.chain_year),
                        getString(R.string.chain_price),
                        getString(R.string.chain_image_url),
                        getString(R.string.chain_ads_url)));
                itemList.add(new Item(
                        getString(R.string.tire_tubes_name),
                        getString(R.string.tire_tubes_year),
                        getString(R.string.tire_tubes_price),
                        getString(R.string.tire_tubes_image_url),
                        getString(R.string.tire_tubes_ads_url)));
                itemList.add(new Item(
                        getString(R.string.pedals_name),
                        getString(R.string.pedals_year),
                        getString(R.string.pedals_price),
                        getString(R.string.pedals_image_url),
                        getString(R.string.pedals_ads_url)));
                itemList.add(new Item(
                        getString(R.string.saddle_name),
                        getString(R.string.saddle_year),
                        getString(R.string.saddle_price),
                        getString(R.string.saddle_image_url),
                        getString(R.string.saddle_ads_url)));

                break;
        }
        return itemList;
    }

    @Override
    public void onItemClick(int position) {
        Item clickedItem = itemList.get(position);
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