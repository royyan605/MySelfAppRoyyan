package com.example.royyan;

// Author : Royyan Diaularsyi - 10120803 - AKBUL1
// Tanggal : 12 Juni 2024

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class VPActivityAdapter extends FragmentStateAdapter {
    private String[] titles = new String[] {"Activities","Friendlist"};

    public VPActivityAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0 :
                return new TabActivityFragment();
            case 1 :
                return new TabFriendlistFragment();
        }
        return new TabActivityFragment();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

}
