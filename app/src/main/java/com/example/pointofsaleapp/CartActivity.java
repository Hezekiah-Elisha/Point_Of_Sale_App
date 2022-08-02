package com.example.pointofsaleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CartActivity extends AppCompatActivity {
    TextView first;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        first = findViewById(R.id.txtTest);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String example;

//        String milkQuantity = intent.getStringExtra("milk").toString();
        if (extras != null ){
            example = extras.getString("milk");
        }else{
            example = "The fucking oone";
        }

        first.setText(example+" yyy");
    }
}