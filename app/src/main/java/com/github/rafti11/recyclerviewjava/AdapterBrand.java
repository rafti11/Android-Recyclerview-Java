package com.github.rafti11.recyclerviewjava;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterBrand extends RecyclerView.Adapter<AdapterBrand.BrandViewHolder> {

    private ArrayList<Brand> brands;
    private Activity activity;

    public AdapterBrand(Activity activity, ArrayList<Brand> brands){
        this.brands = brands;
        this.activity = activity;
    }

    @NonNull
    @Override
    public BrandViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car, parent, false);
        return new BrandViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull BrandViewHolder holder, int position) {

        Brand brand = brands.get(position);

        // Set name and image.
        holder.name.setText(brand.getName());
        holder.logo.setImageDrawable(AppCompatResources.getDrawable(activity, brand.getLogo()));

    }

    @Override
    public int getItemCount() {
        return brands.size();
    }

    public static class BrandViewHolder extends RecyclerView.ViewHolder{

        private TextView name;
        private ImageView logo;

        public BrandViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.brandName);
            logo = itemView.findViewById(R.id.logoImageView);

        }
    }
}
