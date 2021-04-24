package com.example.andr3lesson4.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.andr3lesson4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}