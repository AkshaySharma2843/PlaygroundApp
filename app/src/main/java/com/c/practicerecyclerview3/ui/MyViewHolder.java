package com.c.practicerecyclerview3.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.c.practicerecyclerview3.R;
import com.c.practicerecyclerview3.model.Avengers;
import com.c.practicerecyclerview3.model.HeroModel;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView name;
    TextView realName;
    TextView power;
    ImageView heroImageView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.tv_heroName);
        power = itemView.findViewById(R.id.tv_power1);
        realName = itemView.findViewById(R.id.tv_realName);
        heroImageView = itemView.findViewById(R.id.imageView);
    }

    public void bind(HeroModel avenger) {

        name.setText(avenger.getName());
        power.setText(avenger.getPower());
        realName.setText(avenger.getRealname());
        Glide.with(itemView.getContext())
                .load(avenger.getImage())
                .into(heroImageView);
    }
}
