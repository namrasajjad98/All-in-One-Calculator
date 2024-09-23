package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

   CardView arithmetic,mod,factorial1,currency,Decimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arithmetic = findViewById(R.id.arthmetic);
        mod = findViewById(R.id.mod);
        factorial1 = findViewById(R.id.factorial);
        currency = findViewById(R.id.currConvertor);
        Decimal = findViewById(R.id.decimal);

        arithmetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Arithmetic.class);
                startActivity(intent);
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, mod.class);
                startActivity(intent1);
            }
        });

        factorial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this,factorial.class);
                startActivity(intent2);
            }
        });

        currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this , CurrencyConverter.class);
                startActivity(intent3);
            }
        });
        Decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this,decimalConversion.class);
                startActivity(intent3);
            }
        });
    }
}