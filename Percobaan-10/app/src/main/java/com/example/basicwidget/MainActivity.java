package com.example.basicwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox sate, rawon, ayam_malay, cibus, nasi_krawu;
    Button pilih, btnHelloWorld, btnKalkulator;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sate   = findViewById(R.id.checkBox1);
        rawon  = findViewById(R.id.checkBox2);
        ayam_malay = findViewById(R.id.checkBox3);
        cibus = findViewById(R.id.checkBox4);
        nasi_krawu = findViewById(R.id.checkBox5);
        pilih  = findViewById(R.id.button1);
        hasil  = findViewById(R.id.textView1);
        btnHelloWorld = findViewById(R.id.btnHelloWorld);
        btnKalkulator = findViewById(R.id.btnKalkulator);

        pilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder a = new StringBuilder();
                if (sate.isChecked())  a.append("sate\n");
                if (rawon.isChecked()) a.append("rawon\n");
                if (ayam_malay.isChecked()) a.append("ayam malay\n");
                if (cibus.isChecked()) a.append("cibus\n");
                if (nasi_krawu.isChecked()) a.append("nasi krawu\n");
                hasil.setText(a.toString());
            }
        });

        btnHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, helloWorld.class);
                startActivity(intent);
            }
        });

        btnKalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Kalkulator.class);
                startActivity(intent);
            }
        });
    }
}
