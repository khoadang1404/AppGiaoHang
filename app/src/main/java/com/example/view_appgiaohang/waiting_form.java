package com.example.view_appgiaohang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class waiting_form extends AppCompatActivity {
    Handler wtf = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.waiting_form);
        wtf.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(waiting_form.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 3000);
    }
}