package com.example.view_appgiaohang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class manage_account extends AppCompatActivity {
    ImageButton home;
    ImageButton list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_account);

    home = (ImageButton) findViewById(R.id.home);
    list = (ImageButton) findViewById(R.id.list);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(manage_account.this, home_form.class);
                startActivity(intent);
            }
        });

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(manage_account.this, history_layout.class);
                startActivity(intent);
            }
        });
    }
}