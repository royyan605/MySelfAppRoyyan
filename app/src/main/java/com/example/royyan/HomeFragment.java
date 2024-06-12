package com.example.royyan;

// Author : Royyan Diaularsyi - 10120803 - AKBUL1
// Tanggal : 12 Juni 2024

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;


public class HomeFragment extends Fragment {

    CardView btnHobby, btnFood, btnInterest, btnDream;
    Dialog dialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void openHobbyDialog() {
        dialog.setContentView(R.layout.hobby_layout_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewClose = dialog.findViewById(R.id.ivClose);


        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Toast.makeText(getContext(), "Dialog Closed", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();
    }

    private void openFoodDialog() {
        dialog.setContentView(R.layout.food_layout_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewClose = dialog.findViewById(R.id.ivClose);


        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Toast.makeText(getContext(), "Dialog Closed", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();
    }

    private void openInterestDialog() {
        dialog.setContentView(R.layout.interest_layout_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewClose = dialog.findViewById(R.id.ivClose);


        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Toast.makeText(getContext(), "Dialog Closed", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();
    }

    private void openDreamDialog() {
        dialog.setContentView(R.layout.dream_layout_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewClose = dialog.findViewById(R.id.ivClose);


        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Toast.makeText(getContext(), "Dialog Closed", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final Context contextThemeWrapper = new ContextThemeWrapper(getActivity(), R.style.Theme_MYSELF);

        // clone the inflater using the ContextThemeWrapper
        LayoutInflater localInflater = inflater.cloneInContext(contextThemeWrapper);

        // inflate the layout using the cloned inflater, not default inflater
        View view = localInflater.inflate(R.layout.fragment_home, null, false);

        btnHobby = view.findViewById(R.id.cardHobby);
        btnFood = view.findViewById(R.id.cardFavorite);
        btnInterest = view.findViewById(R.id.cardInterest);
        btnDream = view.findViewById(R.id.cardDream);

        dialog = new Dialog(getContext());

        btnHobby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHobbyDialog();
            }
        });

        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFoodDialog();
            }
        });

        btnInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInterestDialog();
            }
        });

        btnDream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDreamDialog();
            }
        });

        return view;
    }


}