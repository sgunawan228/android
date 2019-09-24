package com.example.hitungluas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segitiga extends AppCompatActivity {
    EditText inputAlas;
    EditText inputTinggi;
    Button tombol;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segitiga);

        inputAlas = findViewById(R.id.inputPanjang);
        inputTinggi = findViewById(R.id.inputLebar);
        tombol = findViewById(R.id.tombol);
        txtHasil = findViewById(R.id.txtHasil);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int alas = Integer.valueOf(inputAlas.getText().toString());
                int tinggi = Integer.valueOf(inputTinggi.getText().toString());

                int hasil = alas*tinggi/2;

                txtHasil.setText(String.valueOf(hasil));
            }
        });
    }
}
