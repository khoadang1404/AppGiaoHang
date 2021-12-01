package com.example.view_appgiaohang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class manage_account extends AppCompatActivity {
    ImageButton home;
    ImageButton list;
    TextView body_money_check;
    TextView body_user_plus;
    ImageButton image_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_account);

    home = (ImageButton) findViewById(R.id.home);
    list = (ImageButton) findViewById(R.id.list);
    body_money_check = (TextView) findViewById(R.id.body_money_check);
    body_user_plus = (TextView) findViewById(R.id.body_user_plus);
    image_btn = (ImageButton) findViewById(R.id.image_btn);
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

        body_money_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(manage_account.this, thanh_toan.class);
                startActivity(intent);
            }
        });

        body_user_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(manage_account.this, moi_ban_be.class);
                startActivity(intent);
            }
        });

        image_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(manage_account.this, home_form.class);
                startActivity(intent);
            }
        });
    }
}