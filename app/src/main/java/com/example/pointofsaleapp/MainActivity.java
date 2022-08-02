package com.example.pointofsaleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnMilk, btnBread, btnPolish, btnPen, btnCart;
    final int[] milkQuantity = {0};
    final int[] breadQuantity = {0};
    final int[] polishQuantity = {0};
    final int[] penQuantity = {0};
    Bundle bnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMilk = findViewById(R.id.btnMilk);
        btnBread = findViewById(R.id.btnBread);
        btnPolish = findViewById(R.id.btnPolish);
        btnPen = findViewById(R.id.btnPen);
        btnCart = findViewById(R.id.btnCart);

        bnd = new Bundle();

        btnMilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (milkQuantity[0] <4){
                    milkQuantity[0] = milkQuantity[0] + 1;
                    Toast.makeText(MainActivity.this, "Added Milk\nQuantity: "+milkQuantity[0], Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "You can only order a max of 4", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnBread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (breadQuantity[0] < 4){
                    breadQuantity[0] = breadQuantity[0] + 1;
                    Toast.makeText(MainActivity.this, "Added Bread\nQuantity: "+breadQuantity[0], Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "You can only order a max of 4", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnPolish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (polishQuantity[0] < 4){
                    polishQuantity[0] = polishQuantity[0] + 1;
                    Toast.makeText(MainActivity.this, "Added polish\nQuantity: "+polishQuantity[0], Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "You can only order a max of 4", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnPen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (penQuantity[0] < 4){
                    penQuantity[0] = penQuantity[0] + 1;
                    Toast.makeText(MainActivity.this, "Added Pen\nQuantity: "+penQuantity[0], Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "You can only order a max of 4", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Showing the cart", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), CartActivity.class);
//                intent.setAction(Intent.ACTION_SEND);

                intent.putExtra("milk", milkQuantity[0]);

//                intent.putExtra("bread_quantity", breadQuantity[0]);
//                intent.putExtra("polish_quantity", polishQuantity[0]);
//                intent.putExtra("pen_quantity", penQuantity[0]);
                startActivity(intent);
            }
        });

    }
}