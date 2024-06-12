package com.example.royyan;

// Author : Royyan Diaularsyi - 10120803 - AKBUL1
// Tanggal : 12 Juni 2024

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class VPMusicAdapter extends FragmentStateAdapter {

    private String[] titles = new String[] {"Music","Video"};

    public VPMusicAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0 :
                return new TabMusicFragment();
            case 1 :
                return new TabVideoFragment();
        }
        return new TabMusicFragment();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }



}
