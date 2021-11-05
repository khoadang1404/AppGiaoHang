package com.example.view_appgiaohang.fragments;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.view_appgiaohang.fragments.ComingFragment;
import com.example.view_appgiaohang.fragments.history_DraftFragment;
import com.example.view_appgiaohang.fragments.history_HistoryFragment;

public class history_FragmentAdapter extends FragmentStateAdapter {

    Context context;
    public history_FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, @NonNull Context context) {
        super(fragmentManager, lifecycle);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position)
        {
            case 1:
                return new history_HistoryFragment();
            case 2:
                return new history_DraftFragment();
        }

        return new ComingFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
