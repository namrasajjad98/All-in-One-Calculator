package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class decimalConversion extends AppCompatActivity {

    EditText decimalText;
    TextView decimalResult;
    Button bin , octal ,hexa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal_conversion);

        decimalText = findViewById(R.id.decimalNumb);
        decimalResult = findViewById(R.id.resultDec);
        bin = findViewById(R.id.binaryBtn);
        octal = findViewById(R.id.btnOctal);
        hexa = findViewById(R.id.btnHexa);

        bin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String decimalStr = decimalText.getText().toString();
                if (!decimalStr.isEmpty()) {
                    int decimal = Integer.parseInt(decimalStr);
                    String binary = Integer.toBinaryString(decimal);
                    decimalResult.setText(binary);
                    decimalResult.setVisibility(View.VISIBLE);
                }else {
                        decimalResult.setText("Enter a decimal number");
                    decimalResult.setVisibility(View.VISIBLE);
                    }
                }
        });

        octal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String decimalStr = decimalText.getText().toString();
                if (!decimalStr.isEmpty()) {
                    int decimal = Integer.parseInt(decimalStr);
                    String octal = Integer.toOctalString(decimal);
                    decimalResult.setText(octal);
                    decimalResult.setVisibility(View.VISIBLE);
                }else {
                    decimalResult.setText("Enter a decimal number");
                    decimalResult.setVisibility(View.VISIBLE);
                }
            }
        });

        hexa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String decimalStr = decimalText.getText().toString();
                if (!decimalStr.isEmpty()) {
                    int decimal = Integer.parseInt(decimalStr);
                    String hexadecimal = Integer.toHexString(decimal);
                    decimalResult.setText(hexadecimal);
                    decimalResult.setVisibility(View.VISIBLE);
                }else {
                    decimalResult.setText("Enter a decimal number");
                    decimalResult.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}