package com.example.view_appgiaohang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class finding_location extends AppCompatActivity {

    ImageButton account;
    ImageButton list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finding_location);

        account = (ImageButton) findViewById(R.id.account);
        list = (ImageButton) findViewById(R.id.list);

        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(finding_location.this, manage_account.class);
                startActivity(intent);
            }
        });

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(finding_location.this, history_layout.class);
                startActivity(intent);
            }
        });

    }
}
