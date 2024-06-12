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

import java.util.ArrayList;
import java.util.List;


public class TabFriendlistFragment extends Fragment {

    private RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_friendlist, container, false);
        rcvCategory = view.findViewById(R.id.rcv_category);
        categoryAdapter = new CategoryAdapter(this.getContext());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL,false);
        rcvCategory.setLayoutManager(linearLayoutManager);
        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private List<FriendCategory> getListCategory() {
        List<FriendCategory> listCategory = new ArrayList<>();
        List<Friend> listFriend = new ArrayList<>();
        listFriend.add(new Friend(R.drawable.friend1, "Dua Lipa", "082216386980"));
        listFriend.add(new Friend(R.drawable.friend2, "Olivia", "082156548364"));
        listFriend.add(new Friend(R.drawable.friend3, "Stewart", "085423132838"));
        listFriend.add(new Friend(R.drawable.friend4, "Zooey", "086324453235"));
        listFriend.add(new Friend(R.drawable.friend5, "Kate", "081366547893"));
        listFriend.add(new Friend(R.drawable.friend6, "Alex", "085346698713"));
        listFriend.add(new Friend(R.drawable.friend7, "Jennifer", "082143654796"));

        listFriend.add(new Friend(R.drawable.friend5, "Kate", "081366547893"));
        listFriend.add(new Friend(R.drawable.friend6, "Alex", "085346698713"));
        listFriend.add(new Friend(R.drawable.friend7, "Jennifer", "082143654796"));
        listFriend.add(new Friend(R.drawable.friend1, "Dua Lipa", "082216386980"));
        listFriend.add(new Friend(R.drawable.friend2, "Olivia", "082156548364"));
        listFriend.add(new Friend(R.drawable.friend3, "Stewart", "085423132838"));
        listFriend.add(new Friend(R.drawable.friend4, "Zooey", "086324453235"));

        listCategory.add(new FriendCategory("Close Friends", listFriend));
        listCategory.add(new FriendCategory("College Friends", listFriend));
        listCategory.add(new FriendCategory("Highschool Friends", listFriend));
        listCategory.add(new FriendCategory("Childhood Friends", listFriend));

        return listCategory;
    }
}