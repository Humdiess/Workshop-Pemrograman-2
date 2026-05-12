package com.example.basicwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kalkulator extends AppCompatActivity {
    EditText harga, jumlah;
    Button hitung, btnMain, btnHelloWorld;
    TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalkulator);

        // Inisialisasi View Kalkulator
        harga  = findViewById(R.id.editText1);
        jumlah = findViewById(R.id.editText2);
        hitung = findViewById(R.id.button1);
        total  = findViewById(R.id.textView1);

        // Inisialisasi View Navigasi
        btnMain = findViewById(R.id.btnMain);
        btnHelloWorld = findViewById(R.id.btnHelloWorld);

        // Logic Kalkulator
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strHarga = harga.getText().toString();
                String strJumlah = jumlah.getText().toString();

                if (strHarga.isEmpty() || strJumlah.isEmpty()) {
                    Toast.makeText(Kalkulator.this, "Harap isi semua field", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    int valHarga = Integer.parseInt(strHarga);
                    int valJumlah = Integer.parseInt(strJumlah);
                    int valTotal = valHarga * valJumlah;

                    total.setText("Total: Rp " + valTotal);
                } catch (NumberFormatException e) {
                    Toast.makeText(Kalkulator.this, "Input tidak valid", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Logic Navigasi
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kalkulator.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kalkulator.this, helloWorld.class);
                startActivity(intent);
            }
        });
    }
}
