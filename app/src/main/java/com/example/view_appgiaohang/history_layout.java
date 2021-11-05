package com.example.view_appgiaohang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.view_appgiaohang.R;
import com.example.view_appgiaohang.fragments.history_FragmentAdapter;
import com.google.android.material.tabs.TabLayout;

public class history_layout extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 pager2;
    history_FragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history_layout);

        tabLayout = findViewById(R.id.tab_layout);
        pager2 = findViewById(R.id.view_pager2);

        FragmentManager fm = getSupportFragmentManager();
        adapter = new history_FragmentAdapter(fm, getLifecycle(), getApplicationContext());
        pager2.setAdapter(adapter);

        tabLayout.addTab(tabLayout.newTab().setText("Đang đến"));
        tabLayout.addTab(tabLayout.newTab().setText("Lịch sử"));
        tabLayout.addTab(tabLayout.newTab().setText("Đơn nháp"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                setViewItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
//                super.onPageSelected(position);
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });


    }

    private void setViewItem(int item) {
        this.pager2.setCurrentItem(item);
    }

}