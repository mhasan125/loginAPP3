package com.example.loginapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                Class MainActivity;
                Intent intent =new Intent(splashscreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}