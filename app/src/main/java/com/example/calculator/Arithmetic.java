package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Arithmetic extends AppCompatActivity {

    EditText et1,et2;
    AppCompatButton add,subtract,multiply,divide;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithmetic);

        et1 = findViewById(R.id.numb);
        et2 = findViewById(R.id.numb1);
        add = findViewById(R.id.addBtn);
        subtract = findViewById(R.id.btnSubtract);
        divide = findViewById(R.id.btnDivide);
        multiply = findViewById(R.id.btnMultiply);
        text = findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String firstNumberStr = et1.getText().toString();
                String secondNumberStr = et2.getText().toString();

                if (!firstNumberStr.isEmpty() && !secondNumberStr.isEmpty()) {
                    double firstNumber = Double.parseDouble(firstNumberStr);
                    double secondNumber = Double.parseDouble(secondNumberStr);

                    double result = firstNumber + secondNumber;
                    String resultStr = String.valueOf(result);
                    text.setText(resultStr);
                    text.setVisibility(View.VISIBLE);

                }
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstNumberStr = et1.getText().toString();
                String secondNumberStr = et2.getText().toString();

                if (!firstNumberStr.isEmpty() && !secondNumberStr.isEmpty()) {
                    double firstNumber = Double.parseDouble(firstNumberStr);
                    double secondNumber = Double.parseDouble(secondNumberStr);

                    double result = firstNumber - secondNumber;
                    String resultStr = String.valueOf(result);
                    text.setText(resultStr);
                    text.setVisibility(View.VISIBLE);
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstNumberStr = et1.getText().toString();
                String secondNumberStr = et2.getText().toString();

                if (!firstNumberStr.isEmpty() && !secondNumberStr.isEmpty()) {
                    double firstNumber = Double.parseDouble(firstNumberStr);
                    double secondNumber = Double.parseDouble(secondNumberStr);

                    double result = firstNumber * secondNumber;
                    String resultStr = String.valueOf(result);
                    text.setText(resultStr);
                    text.setVisibility(View.VISIBLE);
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstNumberStr = et1.getText().toString();
                String secondNumberStr = et2.getText().toString();

                if (!firstNumberStr.isEmpty() && !secondNumberStr.isEmpty()) {
                    double firstNumber = Double.parseDouble(firstNumberStr);
                    double secondNumber = Double.parseDouble(secondNumberStr);

                    double result = firstNumber / secondNumber;
                    String resultStr = String.valueOf(result);
                    text.setText(resultStr);
                    text.setVisibility(View.VISIBLE);
                }
            }

        });
    }
}

