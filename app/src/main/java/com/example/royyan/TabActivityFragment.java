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


public class TabActivityFragment extends Fragment {

    RecyclerView recyclerView;

    String s1[], s2[];
    int image[] = {R.drawable.activity1,R.drawable.activity2,R.drawable.activity3,R.drawable.activity4,R.drawable.activity5,
            R.drawable.activity6,R.drawable.activity7,R.drawable.activity8,R.drawable.activity9};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab_activity, container, false);
        recyclerView = view.findViewById(R.id.rvActivities);
        s1 = getResources().getStringArray(R.array.daily_activities);
        s2 = getResources().getStringArray(R.array.desc_activities);

        RVActivitiesAdapter rvActivitiesAdapter = new RVActivitiesAdapter(this, s1, s2, image);

        recyclerView.setAdapter(rvActivitiesAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}