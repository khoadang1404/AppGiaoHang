package com.example.view_appgiaohang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class moi_ban_be extends AppCompatActivity {

    ImageButton image_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moi_ban_be);

        image_btn = (ImageButton) findViewById(R.id.image_btn);

        image_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(moi_ban_be.this, manage_account.class);
                startActivity(intent);
            }
        });
    }


}