package com.example.garageapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class vehicleAdapter extends RecyclerView.Adapter<vehicleAdapter.ViewHolder>{
    Context context;
    private final List<Item> itemList;
    private final RecyclerViewInterface recyclerViewInterface;

    //Constructor
    public vehicleAdapter(Context context, List<Item> itemList, RecyclerViewInterface recyclerViewInterface) {
        this.context = context;
        this.itemList = itemList;
        this.recyclerViewInterface = recyclerViewInterface;
    }

    @NonNull
    @Override
    public vehicleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_layout,parent,false);
        return new ViewHolder(view, recyclerViewInterface);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nameView.setText(itemList.get(position).getName());
        holder.priceView.setText(itemList.get(position).getPrice());
        holder.makeView.setText(itemList.get(position).getYear());

        // Use Glide to load the image into the ImageView
        Glide.with(context)
                .load(itemList.get(position).getImageUrl()) // Assuming carList stores resource IDs
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView nameView, makeView, priceView;
        public ViewHolder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            nameView = itemView.findViewById(R.id.name);
            priceView = itemView.findViewById(R.id.price);
            makeView = itemView.findViewById(R.id.make);

            itemView.setOnClickListener(view -> {
                if(recyclerViewInterface != null){
                    int pos = getAbsoluteAdapterPosition();
                    if (pos != RecyclerView.NO_POSITION){
                        recyclerViewInterface.onItemClick(pos);
                    }
                }
            });
        }
    }
}
