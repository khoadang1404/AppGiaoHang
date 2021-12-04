package com.example.view_appgiaohang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator3;

public class home_form extends AppCompatActivity {

    private ViewPager2 mViewPager2;
    private CircleIndicator3 mCircleIndicator3;
    private List<Photo> mListPhoto;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private Runnable mRunnable = new Runnable() {
        @Override
        public void run() {
            int currentPosition = mViewPager2.getCurrentItem();
            if(currentPosition == mListPhoto.size() - 1){
                mViewPager2.setCurrentItem(0);
            }else{
                mViewPager2.setCurrentItem(currentPosition + 1);
            }

        }
    };

    ImageButton account;
    ImageButton list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_form);

        mViewPager2 = findViewById(R.id.view_pager_2);
        mCircleIndicator3 = findViewById(R.id.circle_indicator_3);

        mListPhoto = getListPhoto();
        PhotoAdapter photoAdapter = new PhotoAdapter(this, mListPhoto);
        mViewPager2.setAdapter(photoAdapter);
        mCircleIndicator3.setViewPager(mViewPager2);

        mViewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                mHandler.removeCallbacks(mRunnable);
                mHandler.postDelayed(mRunnable, 2000);
            }
        });

        account = (ImageButton) findViewById(R.id.account);
        list = (ImageButton) findViewById(R.id.list);

        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home_form.this, manage_account.class);
                startActivity(intent);
            }
        });

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home_form.this, history_layout.class);
                startActivity(intent);
            }
        });
    }

    private List<Photo> getListPhoto() {
        List<Photo> list = new ArrayList<>();
        list.add(new Photo(R.drawable.home_form_img1));
        list.add(new Photo(R.drawable.home_form_img2));
        list.add(new Photo(R.drawable.home_form_img3));
        list.add(new Photo(R.drawable.home_form_img4));
        list.add(new Photo(R.drawable.home_form_img5));
        list.add(new Photo(R.drawable.home_form_img6));
        list.add(new Photo(R.drawable.home_form_img7));
        list.add(new Photo(R.drawable.home_form_img8));

        return list;
    }

    @Override
    protected void onPause() {
        super.onPause();
        mHandler.removeCallbacks(mRunnable);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mHandler.postDelayed(mRunnable, 2000);
    }
}