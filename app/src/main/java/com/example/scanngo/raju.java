package com.example.scanngo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;


import com.example.scanngo.Adapters.MainAdapterR;
import com.example.scanngo.Models.MainModel;
import com.example.scanngo.databinding.ActivityRajuBinding;

import java.util.ArrayList;

public class raju extends AppCompatActivity {

    ActivityRajuBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRajuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel("Biryani",  "250"));
        list.add(new MainModel("Daal",  "200"));
        list.add(new MainModel("Handi",  "100"));
        list.add(new MainModel("Karhayi",  "200"));
        list.add(new MainModel("Fries",  "50"));
        list.add(new MainModel("Pizza",  "350"));
        list.add(new MainModel("Sandwich",  "250"));

        MainAdapterR adapter = new MainAdapterR(list, this);
        binding.recyclerview.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);

    }



}
