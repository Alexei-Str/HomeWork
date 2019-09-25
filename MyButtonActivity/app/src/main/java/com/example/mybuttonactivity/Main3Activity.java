package com.example.mybuttonactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        findViewById(R.id.button3).setOnClickListener(v -> {
            Intent intent = new Intent(this, Main4Activity.class);
            startActivity(intent);
        });
    }
}
