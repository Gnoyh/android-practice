package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_input;
    Button btn_move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        SettingListener();
    }

    private void init() {
        et_input = findViewById(R.id.et_input);
        btn_move = findViewById(R.id.btn_move);
    }

    private void SettingListener() {
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = et_input.getText().toString();

                Intent intent = new Intent(MainActivity.this, SubActivity.class);

                intent.putExtra("text", input);
                startActivity(intent);
            }
        });
    }
}