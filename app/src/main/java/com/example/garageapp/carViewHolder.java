package com.example.garageapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class carViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView nameView, makeView, priceView;
    public carViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        nameView = itemView.findViewById(R.id.name);
        priceView = itemView.findViewById(R.id.price);
        makeView = itemView.findViewById(R.id.make);

    }
}
