package com.example.royyan;

// Author : Royyan Diaularsyi - 10120803 - AKBUL1
// Tanggal : 12 Juni 2024


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    private Context mContext;
    private List<FriendCategory> mFriendCategory;

    public CategoryAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<FriendCategory> list) {
        this.mFriendCategory = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.friendlist_category, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        FriendCategory friendCategory = mFriendCategory.get(position);
        if (friendCategory == null) {
            return;
        }

        holder.friendCategory.setText(friendCategory.getNameCategory());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false);
        holder.rcvCategory.setLayoutManager(linearLayoutManager);

        FriendlistAdapter friendlistAdapter = new FriendlistAdapter();
        friendlistAdapter.setData(friendCategory.getFriendList());
        holder.rcvCategory.setAdapter(friendlistAdapter);

    }

    @Override
    public int getItemCount() {
        if (mFriendCategory != null) {
            return mFriendCategory.size();
        }
        return 0;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        private TextView friendCategory;
        private RecyclerView rcvCategory;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            friendCategory = itemView.findViewById(R.id.friendlist_category);
            rcvCategory = itemView.findViewById(R.id.rcv_category);
        }


    }
}
