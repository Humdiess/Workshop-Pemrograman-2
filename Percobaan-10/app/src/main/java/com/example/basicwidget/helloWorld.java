package com.example.basicwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class helloWorld extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world);

        Button btnMain = findViewById(R.id.btnMain);
        Button btnKalkulator = findViewById(R.id.btnKalkulator);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(helloWorld.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnKalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(helloWorld.this, Kalkulator.class);
                startActivity(intent);
            }
        });
    }
}
