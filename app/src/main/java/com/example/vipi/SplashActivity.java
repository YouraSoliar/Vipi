package com.example.vipi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView textV, textI, textP, textI2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        textV = findViewById(R.id.textV);
        textI = findViewById(R.id.textI);
        textP = findViewById(R.id.textP);
        textI2 = findViewById(R.id.textI2);
        textV.animate().translationY(-400).setDuration(2000);
        textI.animate().translationY(400).setDuration(2000);
        textP.animate().translationX(-400).setDuration(2000);
        textI2.animate().translationX(400).setDuration(2000);


        final Intent i = new Intent(SplashActivity.this, MainActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(i);
                finish();
            }
        }, 2000);
    }
}