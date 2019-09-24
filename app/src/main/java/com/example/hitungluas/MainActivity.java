package com.example.hitungluas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button segitiga = (Button) findViewById(R.id.segitiga);
        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (getApplication(), com.example.hitungluas.segitiga.class);
                startActivity(intent);
            }
        });
        Button lingkaran = (Button) findViewById(R.id.lingkaran);
        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Lingkaran.class);
                startActivity(i);
            }
        });
        Button persegi = (Button) findViewById(R.id.persegi);
        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent (getApplication(), persegi.class);
                startActivity(a);
            }
        });
    }

}
