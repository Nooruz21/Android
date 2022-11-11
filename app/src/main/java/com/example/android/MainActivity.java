package com.example.android;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.android.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initImage();

        binding.btnGame.setOnClickListener(view -> {
            initNav();
        });

    }

    private void initNav() {
        Intent perehod=new Intent(this,GameOneActivity.class);
        startActivity(perehod);
        finish();
    }

    private void initImage() {
        Glide.with(this).load("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg").centerCrop().into(binding.imageOne);
        Glide.with(this).load("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg").centerCrop().into(binding.imageTwo);
        Glide.with(this).load("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg").centerCrop().into(binding.imageThree);
        Glide.with(this).load("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg").centerCrop().into(binding.imageFour);

    }


}