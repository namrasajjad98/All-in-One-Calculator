package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class mod extends AppCompatActivity {

    EditText text1 ,text2;
    TextView modResult;
    Button modBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod);

        text1 = findViewById(R.id.dividend);
        text2 = findViewById(R.id.divisor);
        modResult = findViewById(R.id.modResult);
        modBtn = findViewById(R.id.modBtn);

        modBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dividendStr = text1.getText().toString();
                String divisorStr = text2.getText().toString();


                if (!dividendStr.isEmpty() && !divisorStr.isEmpty()) {

                    double dividend = Double.parseDouble(divisorStr);
                    double divisor = Double.parseDouble(dividendStr);

                    double result = divisor % dividend;
                    int remainder = (int) result;
                    modResult.setText(String.valueOf(remainder));
                    modResult.setVisibility(View.VISIBLE);
                } else {
                    // If any field is empty, show a message
                    modResult.setText("Enter both divisor and dividend");
                    modResult.setVisibility(View.VISIBLE);
                }

            }
        });
    }
}