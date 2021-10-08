package com.excercise.bareksapatternmigrationtest;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.excercise.bareksapatternmigrationtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnMoveToKotlin.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, KotlinPageActivity.class)));
    }
}