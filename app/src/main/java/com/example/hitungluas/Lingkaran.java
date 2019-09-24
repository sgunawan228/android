package com.example.hitungluas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends AppCompatActivity {
    EditText inputJari;
    Button tombol;
    TextView txtHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        inputJari = findViewById(R.id.inputPanjang);
        tombol = findViewById(R.id.tombol);
        txtHasil = findViewById(R.id.txtHasil);

        tombol.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double jari = Double.parseDouble(String.valueOf(inputJari.getText()));

                double hasil = (3.14 * jari*jari);

                txtHasil.setText(String.valueOf(hasil));
            }
        }));
    }
}
