package com.github.rafti11.recyclerviewjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Brands list
        ArrayList<Brand> brands = new ArrayList<>();

        brands.add(new Brand("Ferrari", R.drawable.ferrari));
        brands.add(new Brand("Ford", R.drawable.ford));
        brands.add(new Brand("Mini", R.drawable.mini));
        brands.add(new Brand("Opel", R.drawable.opel));
        brands.add(new Brand("Seat", R.drawable.seat));
        brands.add(new Brand("Subaru", R.drawable.subaru));
        brands.add(new Brand("Tesla", R.drawable.tesla));
        brands.add(new Brand("Toyota", R.drawable.toyota));
        brands.add(new Brand("Volkswagen", R.drawable.volkswagen));

        RecyclerView recyclerView = findViewById(R.id.rw);
        AdapterBrand adapterBrand = new AdapterBrand(MainActivity.this, brands);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapterBrand);

    }
}