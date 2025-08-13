package com.example.salar;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import com.example.salar.MainActivity;
import com.example.salar.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        findViewById(R.id.button).setOnClickListener(v -> {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
            finish();
        });

        findViewById(R.id.textView7).setOnClickListener(v -> {
            startActivity(new Intent(SplashActivity.this, Registro.class));
            finish();
        });
    }
}
