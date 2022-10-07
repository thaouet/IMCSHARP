package com.thaouet.imcsharp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    Button btnimc;
EditText textTaille, textPoids;
TextView textImc;
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            float poids =Float.parseFloat(textPoids.getText().toString());
            float taille =Float.parseFloat(textTaille.getText().toString());
            float imc = 10000 *  poids/(taille*taille);
            textImc.setText(String.valueOf(imc));
            DecimalFormat df = new DecimalFormat("0.00");
            textImc.setText(df.format(imc));
            textImc.setTextColor(getResources().getColor( R.color.orange));
            Toast.makeText(MainActivity.this, "click", Toast.LENGTH_LONG).show();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnimc = findViewById(R.id.buttonimc);
        btnimc.setOnClickListener(listener);
        textPoids = findViewById(R.id.txtpoids);
        textTaille = findViewById(R.id.txttaille);
        textImc = findViewById(R.id.txtimc);
    }

    public void ButtonClick(View view) {

    }
}