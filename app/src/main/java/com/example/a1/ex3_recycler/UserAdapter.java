package com.example.a1.ex3_recycler;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by a1 on 2017. 4. 8..
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<UserModel.User> mDataset;



    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mName;
        public TextView mPhone;
        public TextView mAge;
        public ImageView mPhoto;

        public ViewHolder(View v) {
            super(v);

            mName = (TextView) v.findViewById(R.id.nameTextView);
            mPhone = (TextView) v.findViewById(R.id.phoneNumberTextView);
            mAge = (TextView) v.findViewById(R.id.ageTextView);
            mPhoto = (ImageView) v.findViewById(R.id.imageView);
        }

    }

    public UserAdapter(Context context, ArrayList<UserModel.User> myDataset) {
        mContext = context;
        mDataset = myDataset;
    }

    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.sub, parent, false);


        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        UserModel.User user = mDataset.get(position);
        Glide.with(mContext)
                .load(user.getImage())
                .centerCrop()
                .into(holder.mPhoto);
        holder.mName.setText(user.getName());
        holder.mPhone.setText(user.getPhone());
        holder.mAge.setText(String.valueOf(user.getAge())+"세");



        holder.mPhoto.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, newActivity.class);
                mContext.startActivity(intent);
                //finish();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}