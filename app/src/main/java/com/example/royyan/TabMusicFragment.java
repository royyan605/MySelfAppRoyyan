package com.example.royyan;

// Author : Royyan Diaularsyi - 10120803 - AKBUL1
// Tanggal : 12 Juni 2024

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TabMusicFragment extends Fragment {

    RecyclerView recyclerView;

    String s1[];
    int image[] = {R.drawable.music1,R.drawable.music2,R.drawable.music3,R.drawable.music4,R.drawable.music5,
            R.drawable.music6,R.drawable.music7,R.drawable.music8,R.drawable.music9,R.drawable.music10};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab_music, container, false);
        recyclerView = view.findViewById(R.id.rvMusic);
        s1 = getResources().getStringArray(R.array.list_music);

        RVMusicAdapter rvMusicAdapter = new RVMusicAdapter(this, s1, image);

        recyclerView.setAdapter(rvMusicAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}