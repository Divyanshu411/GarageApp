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

public class vehicleAdapter extends RecyclerView.Adapter<vehicleAdapter.ViewHolder>{
    Context context;
    private List<item> carList;
    private ItemClickListener mClickListener;
    private final RecyclerViewInterface recyclerViewInterface;

    //Constructor
    public vehicleAdapter(Context context, List<item> carList, RecyclerViewInterface recyclerViewInterface) {
        this.context = context;
        this.carList = carList;
        this.recyclerViewInterface = recyclerViewInterface;

    }
    public interface ItemClickListener{
        void onItemClick(View view, int position);
    }

    void setClickListener(ItemClickListener itemClickListener){
        this.mClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public vehicleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_layout,parent,false);
        return new ViewHolder(view, recyclerViewInterface);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nameView.setText(carList.get(position).getName());
        holder.priceView.setText(carList.get(position).getPrice());
        holder.makeView.setText(carList.get(position).getYear());
        holder.imageView.setImageResource(carList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return carList.size();
    }

    public String getItem(int id) {
        if (id >= 0 && id < carList.size()) {
            item car = carList.get(id);
            return "Car Name: " + car.getName() +
                    "\nYear: " + car.getYear() +
                    "\nPrice: " + car.getPrice() +
                    "\nImage Resource ID: " + car.getImage();
        } else {
            return "Invalid item ID";
        }
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

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(recyclerViewInterface != null){
                        int pos = getAdapterPosition();
                        if (pos != RecyclerView.NO_POSITION){
                            recyclerViewInterface.onItemClick(pos);
                        }
                    }
                }
            });
        }
    }
}
