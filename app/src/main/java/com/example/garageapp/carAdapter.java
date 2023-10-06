package com.example.garageapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class carAdapter extends RecyclerView.Adapter<carViewHolder>{
    Context context;
    private List<item> carList;

    //Constructor
    public carAdapter(Context context, List<item> carList) {
        this.context = context;
        this.carList = carList;
    }

    @NonNull
    @Override
    public carViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new carViewHolder(LayoutInflater.from(context).inflate(R.layout.row_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull carViewHolder holder, int position) {
        holder.nameView.setText(carList.get(position).getName());
        holder.priceView.setText(carList.get(position).getPrice());
        holder.makeView.setText(carList.get(position).getMake());
        holder.imageView.setImageResource(carList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return carList.size();
    }
}
