package com.example.scanngo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


import com.example.scanngo.Adapters.MainAdapterA;
import com.example.scanngo.Models.MainModel;
import com.example.scanngo.databinding.ActivityAyanBinding;

import java.util.ArrayList;

public class ayan extends AppCompatActivity {

    ActivityAyanBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAyanBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel("Burger",  "250"));
        list.add(new MainModel("Pizza",  "200"));
        list.add(new MainModel("Haleem",  "100"));
        list.add(new MainModel("Roll",  "200"));
        list.add(new MainModel("Cookies",  "50"));
        list.add(new MainModel("Chowmien",  "350"));
        list.add(new MainModel("Sandwich",  "250"));

        MainAdapterA adapter = new MainAdapterA(list, this);
        binding.recyclerview.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.orders:
                startActivity(new Intent(ayan.this, OrderActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
