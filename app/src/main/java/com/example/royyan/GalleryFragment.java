package com.example.royyan;

// Author : Royyan Diaularsyi - 10120803 - AKBUL1
// Tanggal : 12 Juni 2024

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class GalleryFragment extends Fragment {

    private RecyclerView galleryRecyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        galleryRecyclerView = view.findViewById(R.id.galleryRecyclerView);
        galleryRecyclerView.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        );

        List<GalleryItem> galleryItems = new ArrayList<>();
        galleryItems.add(new GalleryItem(R.drawable.image11));
        galleryItems.add(new GalleryItem(R.drawable.image12));
        galleryItems.add(new GalleryItem(R.drawable.image13));
        galleryItems.add(new GalleryItem(R.drawable.image16));
        galleryItems.add(new GalleryItem(R.drawable.image17));
        galleryItems.add(new GalleryItem(R.drawable.image18));
        galleryItems.add(new GalleryItem(R.drawable.image14));
        galleryItems.add(new GalleryItem(R.drawable.image15));
        galleryItems.add(new GalleryItem(R.drawable.image6));
        galleryItems.add(new GalleryItem(R.drawable.image7));
        galleryItems.add(new GalleryItem(R.drawable.image8));
        galleryItems.add(new GalleryItem(R.drawable.image9));
        galleryItems.add(new GalleryItem(R.drawable.image10));


        galleryRecyclerView.setAdapter(new GalleryAdapter(galleryItems));

        return view;
    }
}