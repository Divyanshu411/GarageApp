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
                        getResources().getIdentifier(getString(R.string.audi_q5_image), "drawable", getPackageName())));
                itemList.add(new Item(getString(R.string.bmw_3_series),
                        getString(R.string.bmw_3_series_year),
                        getString(R.string.bmw_3_series_price),
                        getResources().getIdentifier(getString(R.string.bmw_3_series_image), "drawable", getPackageName())));
                itemList.add(new Item(getString(R.string.chevrolet_silverado),
                        getString(R.string.chevrolet_silverado_year),
                        getString(R.string.chevrolet_silverado_price),
                        getResources().getIdentifier(getString(R.string.chevrolet_silverado_image), "drawable", getPackageName())));
                itemList.add(new Item(getString(R.string.ford_f150_name),
                        getString(R.string.ford_f150_year),
                        getString(R.string.ford_f150_price),
                        getResources().getIdentifier(getString(R.string.ford_f150_image), "drawable", getPackageName())));
                itemList.add(new Item(getString(R.string.honda_civic_name),
                        getString(R.string.honda_civic_year),
                        getString(R.string.honda_civic_price),
                        getResources().getIdentifier(getString(R.string.honda_civic_image), "drawable", getPackageName())));
                itemList.add(new Item(getString(R.string.mercedes_e_class_name),
                        getString(R.string.mercedes_e_class_year),
                        getString(R.string.mercedes_e_class_price),
                        getResources().getIdentifier(getString(R.string.mercedes_e_class_image), "drawable", getPackageName())));
                itemList.add(new Item(getString(R.string.tesla_model3_name),
                        getString(R.string.tesla_model3_year),
                        getString(R.string.tesla_model3_price),
                        getResources().getIdentifier(getString(R.string.tesla_model3_image), "drawable", getPackageName())));
                itemList.add(new Item(getString(R.string.toyota_camry_name),
                        getString(R.string.toyota_camry_year),
                        getString(R.string.toyota_camry_price),
                        getResources().getIdentifier(getString(R.string.toyota_camry_image), "drawable", getPackageName())));
                itemList.add(new Item(getString(R.string.volkswagen_golf_name),
                        getString(R.string.volkswagen_golf_year),
                        getString(R.string.volkswagen_golf_price),
                        getResources().getIdentifier(getString(R.string.volkswagen_golf_image), "drawable", getPackageName())));

 /*               itemList.add(new item("Audi Q5", "2023", "€45,000", R.drawable.j));
                itemList.add(new item("BMW 3 Series", "2019", "€40,000", R.drawable.g));
                itemList.add(new item("Chevrolet Silverado", "2020", "€30,000", R.drawable.d));
                itemList.add(new item("Ford F-150", "2022", "€30,000", R.drawable.b));
                itemList.add(new item("Honda Civic", "2021", "€22,000", R.drawable.c));
                itemList.add(new item("Mercedes-Benz E-Class", "2028", "€55,000", R.drawable.e));
                itemList.add(new item("Nissan Rogue", "2017", "€25,000", R.drawable.i));
                itemList.add(new item("Tesla Model 3", "2019", "€40,000", R.drawable.h));
                itemList.add(new item("Toyota Camry", "2020", "€25,000", R.drawable.a));
                itemList.add(new item("Volkswagen Golf", "2023", "€23,000", R.drawable.f));*/
                break;
            case "Bikes":
                itemList.add(new Item(
                        getString(R.string.harley_davidson_street_glide_name),
                        getString(R.string.harley_davidson_street_glide_year),
                        getString(R.string.harley_davidson_street_glide_price),
                        getResources().getIdentifier(getString(R.string.harley_davidson_street_glide_image), "drawable", getPackageName())));
                itemList.add(new Item(
                        getString(R.string.bmw_r1250gs_adventure_name),
                        getString(R.string.bmw_r1250gs_adventure_year),
                        getString(R.string.bmw_r1250gs_adventure_price),
                        getResources().getIdentifier(getString(R.string.bmw_r1250gs_adventure_image), "drawable", getPackageName())));
                itemList.add(new Item(
                        getString(R.string.ducati_panigale_v4_name),
                        getString(R.string.ducati_panigale_v4_year),
                        getString(R.string.ducati_panigale_v4_price),
                        getResources().getIdentifier(getString(R.string.ducati_panigale_v4_image), "drawable", getPackageName())));
                itemList.add(new Item(
                        getString(R.string.honda_gold_wing_name),
                        getString(R.string.honda_gold_wing_year),
                        getString(R.string.honda_gold_wing_price),
                        getResources().getIdentifier(getString(R.string.honda_gold_wing_image), "drawable", getPackageName())));
                itemList.add(new Item(
                        getString(R.string.kawasaki_ninja_zx10r_name),
                        getString(R.string.kawasaki_ninja_zx10r_year),
                        getString(R.string.kawasaki_ninja_zx10r_price),
                        getResources().getIdentifier(getString(R.string.kawasaki_ninja_zx10r_image), "drawable", getPackageName())));
                itemList.add(new Item(
                        getString(R.string.suzuki_hayabusa_name),
                        getString(R.string.suzuki_hayabusa_year),
                        getString(R.string.suzuki_hayabusa_price),
                        getResources().getIdentifier(getString(R.string.suzuki_hayabusa_image), "drawable", getPackageName())));
                itemList.add(new Item(
                        getString(R.string.yamaha_yzf_r1_name),
                        getString(R.string.yamaha_yzf_r1_year),
                        getString(R.string.yamaha_yzf_r1_price),
                        getResources().getIdentifier(getString(R.string.yamaha_yzf_r1_image), "drawable", getPackageName())));
                itemList.add(new Item(
                        getString(R.string.triumph_tiger_900_name),
                        getString(R.string.triumph_tiger_900_year),
                        getString(R.string.triumph_tiger_900_price),
                        getResources().getIdentifier(getString(R.string.triumph_tiger_900_image), "drawable", getPackageName())));
                itemList.add(new Item(
                        getString(R.string.ktm_1290_super_duke_r_name),
                        getString(R.string.ktm_1290_super_duke_r_year),
                        getString(R.string.ktm_1290_super_duke_r_price),
                        getResources().getIdentifier(getString(R.string.ktm_1290_super_duke_r_image), "drawable", getPackageName())));
                itemList.add(new Item(
                        getString(R.string.indian_challenger_name),
                        getString(R.string.indian_challenger_year),
                        getString(R.string.indian_challenger_price),
                        getResources().getIdentifier(getString(R.string.indian_challenger_image), "drawable", getPackageName())));


                /*itemList.add(new item("Harley-Davidson Street Glide", "2020", "€30,000", R.drawable.b1));
                itemList.add(new item("BMW R1250GS Adventure", "2022", "€22,000", R.drawable.b2));
                itemList.add(new item("Ducati Panigale V4", "2019", "€28,500", R.drawable.b3));
                itemList.add(new item("Honda Gold Wing", "2018", "€28,300", R.drawable.b4));
                itemList.add(new item("Kawasaki Ninja ZX-10R", "2021", "€17,000", R.drawable.b5));
                itemList.add(new item("Suzuki Hayabusa", "2021", "€18,500", R.drawable.b6));
                itemList.add(new item("Yamaha YZF-R1", "2020", "€17,700", R.drawable.b7));
                itemList.add(new item("Triumph Tiger 900", "2023", "€14,500", R.drawable.b8));
                itemList.add(new item("KTM 1290 Super Duke R", "2018", "€19,500", R.drawable.b9));
                itemList.add(new item("Indian Challenger", "2023", "€23,000", R.drawable.b10));*/
                break;
            case "Others":
                itemList.add(new Item(
                        getString(R.string.oil_filter_name),
                        getString(R.string.oil_filter_year),
                        getString(R.string.oil_filter_price),
                        getResources().getIdentifier(getString(R.string.oil_filter_image), "drawable", getPackageName())));
                itemList.add(new Item(
                        getString(R.string.spark_plugs_name),
                        getString(R.string.spark_plugs_year),
                        getString(R.string.spark_plugs_price),
                        getResources().getIdentifier(getString(R.string.spark_plugs_image), "drawable", getPackageName())));
                itemList.add(new Item(
                        getString(R.string.brake_rotors_name),
                        getString(R.string.brake_rotors_year),
                        getString(R.string.brake_rotors_price),
                        getResources().getIdentifier(getString(R.string.brake_rotors_image), "drawable", getPackageName())));
                itemList.add(new Item(
                        getString(R.string.air_filter_name),
                        getString(R.string.air_filter_year),
                        getString(R.string.air_filter_price),
                        getResources().getIdentifier(getString(R.string.air_filter_image), "drawable", getPackageName())));
                itemList.add(new Item(
                        getString(R.string.ignition_coil_name),
                        getString(R.string.ignition_coil_year),
                        getString(R.string.ignition_coil_price),
                        getResources().getIdentifier(getString(R.string.ignition_coil_image), "drawable", getPackageName())));
                itemList.add(new Item(
                        getString(R.string.brake_pads_name),
                        getString(R.string.brake_pads_year),
                        getString(R.string.brake_pads_price),
                        getResources().getIdentifier(getString(R.string.brake_pads_image), "drawable", getPackageName())));
                itemList.add(new Item(
                        getString(R.string.chain_name),
                        getString(R.string.chain_year),
                        getString(R.string.chain_price),
                        getResources().getIdentifier(getString(R.string.chain_image), "drawable", getPackageName())));
                itemList.add(new Item(
                        getString(R.string.tire_tubes_name),
                        getString(R.string.tire_tubes_year),
                        getString(R.string.tire_tubes_price),
                        getResources().getIdentifier(getString(R.string.tire_tubes_image), "drawable", getPackageName())));
                itemList.add(new Item(
                        getString(R.string.pedals_name),
                        getString(R.string.pedals_year),
                        getString(R.string.pedals_price),
                        getResources().getIdentifier(getString(R.string.pedals_image), "drawable", getPackageName())));
                itemList.add(new Item(
                        getString(R.string.saddle_name),
                        getString(R.string.saddle_year),
                        getString(R.string.saddle_price),
                        getResources().getIdentifier(getString(R.string.saddle_image), "drawable", getPackageName())));
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