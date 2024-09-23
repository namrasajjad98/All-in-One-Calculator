package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CurrencyConverter extends AppCompatActivity {

    EditText currText;
    Spinner fromSpin, toSpin;
    TextView currResult;
    Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);

        currText = findViewById(R.id.currText);
        fromSpin = findViewById(R.id.spinFrom);
        toSpin = findViewById(R.id.spinTo);
        convert = findViewById(R.id.convertBtn);
        currResult = findViewById(R.id.resulConvert);

        String[] from = {"Select Option", "Pak"};
        String[] to = {"Select Option", "USA", "Riyal", "Euro", "USD", "Dirham"};

        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, from);
        fromSpin.setAdapter(ad);

        ArrayAdapter<String> ad1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, to);
        toSpin.setAdapter(ad1);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double total;
                double amount = Double.parseDouble(currText.getText().toString());
                String selectedFrom = fromSpin.getSelectedItem().toString();
                String selectedTo = toSpin.getSelectedItem().toString();

                if (selectedFrom.equals("Pak") && selectedTo.equals("USA")) {
                    total = amount * 276.67;
                    currResult.setText(String.valueOf(total));
                    currResult.setVisibility(View.VISIBLE);
                } else if (selectedFrom.equals("Pak") && selectedTo.equals("Riyal")) {
                    total = amount * 73.78;
                    currResult.setText(String.valueOf(total));
                    currResult.setVisibility(View.VISIBLE);
                } else if (selectedFrom.equals("Pak") && selectedTo.equals("Euro")) {
                    total = amount * 297.84;
                    currResult.setText(String.valueOf(total));
                    currResult.setVisibility(View.VISIBLE);
                } else if (selectedFrom.equals("Pak") && selectedTo.equals("USD")) {
                    total = amount * 276.67;
                    currResult.setText(String.valueOf(total));
                    currResult.setVisibility(View.VISIBLE);
                } else if (selectedFrom.equals("Pak") && selectedTo.equals("Dirham")) {
                    total = amount * 75.33;
                    currResult.setText(String.valueOf(total));
                    currResult.setVisibility(View.VISIBLE);
                } else {
                    currResult.setText("Select Option");
                    currResult.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
