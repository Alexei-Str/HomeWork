package com.example.mybuttonactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        findViewById(R.id.button4).setOnClickListener(v -> {
            Intent intent = new Intent(this, Main5Activity.class);
            startActivity(intent);
        });
    }
}
