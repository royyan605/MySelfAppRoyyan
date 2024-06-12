package com.example.royyan;

// Author : Royyan Diaularsyi - 10120803 - AKBUL1
// Tanggal : 12 Juni 2024

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

public class FriendlistCard {
    int image;
    String title;
    GradientDrawable color;

    public FriendlistCard(GradientDrawable color, int image, String title) {
        this.image = image;
        this.title = title;
        this.color = color;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }


    public Drawable getgradient() {
        return color;
    }
}
