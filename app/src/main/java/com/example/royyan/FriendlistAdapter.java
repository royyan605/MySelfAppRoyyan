package com.example.royyan;

// Author : Royyan Diaularsyi - 10120803 - AKBUL1
// Tanggal : 12 Juni 2024

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class FriendlistAdapter extends RecyclerView.Adapter<FriendlistAdapter.FriendViewHolder> {

    private List<Friend> mFriend;
    public void setData(List<Friend> list) {
        this.mFriend = list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public FriendViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.friendlist_card, parent, false);
        return new FriendViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendViewHolder holder, int position) {
        Friend friend = mFriend.get(position);
        if (friend == null) {
            return;
        }

        holder.imgFriend.setImageResource(friend.getFriendId());
        holder.nameFriend.setText(friend.getName());
        holder.numberFriend.setText(friend.getPhone());
    }

    @Override
    public int getItemCount() {
        if (mFriend!= null) {
            return mFriend.size();
        }
        return 0;
    }

    public class FriendViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFriend;
        private TextView nameFriend;
        private TextView numberFriend;

        public FriendViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFriend = itemView.findViewById(R.id.friend_image);
            nameFriend = itemView.findViewById(R.id.friend_name);
            numberFriend = itemView.findViewById(R.id.friend_number);
        }
    }

}