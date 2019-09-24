package com.example.hitungluas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class persegi extends AppCompatActivity {
    EditText inputPanjang;
    EditText inputLebar;
    Button tombol;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        inputPanjang = findViewById(R.id.inputPanjang);
        inputLebar = findViewById(R.id.inputLebar);
        tombol = findViewById(R.id.tombol);
        txtHasil = findViewById(R.id.txtHasil);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int panjang = Integer.valueOf(inputPanjang.getText().toString());
                int lebar = Integer.valueOf(inputLebar.getText().toString());

                int hasil = panjang*lebar;

                txtHasil.setText(String.valueOf(hasil));
            }
        });
    }
}
