package com.example.e_recycletest;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.e_recycletest.fragments.LearnFragment;
import com.example.e_recycletest.fragments.LocalFragment;
import com.example.e_recycletest.fragments.ScanFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter{

    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new ScanFragment();
            case 1:
                return new LocalFragment();
            case 2:
                return new LearnFragment();
            default:
                return new ScanFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
