package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class factorial extends AppCompatActivity {

    EditText textFact;
    TextView resultFact;
    Button btnFact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);

        textFact = findViewById(R.id.numbfact);
        resultFact = findViewById(R.id.resultFact);
        btnFact = findViewById(R.id.factBtn);

        btnFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String factStr = textFact.getText().toString();
                BigInteger number = new BigInteger(factStr);
                BigInteger fact = BigInteger.ONE;
                for (BigInteger i = BigInteger.ONE; i.compareTo(number) <= 0; i = i.add(BigInteger.ONE)) {
                    fact = fact.multiply(i);

                    }
                    resultFact.setText(String.valueOf(fact));
                    resultFact.setVisibility(View.VISIBLE);
                }
        });
    }
}