package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_short;
    Button btn_long;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btn_short = findViewById(R.id.btn_short);
        btn_long = findViewById(R.id.btn_long);

        btn_short.setOnClickListener(this::onClick);
        btn_long.setOnClickListener(this::onClick);
    }

    private void onClick(View v) {
        if (v.getId() == R.id.btn_short) {
            Toast.makeText(getApplicationContext(), "짧게 출력!", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getApplicationContext(), "길게 출력!", Toast.LENGTH_LONG).show();
        }
    }


}