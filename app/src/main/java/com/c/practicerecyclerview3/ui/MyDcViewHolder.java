package com.c.practicerecyclerview3.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.c.practicerecyclerview3.R;
import com.c.practicerecyclerview3.model.DC;
import com.c.practicerecyclerview3.model.HeroModel;

public class MyDcViewHolder extends RecyclerView.ViewHolder {
    TextView hero_name;
    TextView real_name;
    TextView power;
    ImageView image;
    public MyDcViewHolder(@NonNull View itemView) {
        super(itemView);

        hero_name = itemView.findViewById(R.id.tv_heroName);
        real_name = itemView.findViewById(R.id.tv_realName);
        power = itemView.findViewById(R.id.tv_power1);
        image = itemView.findViewById(R.id.imageView);
    }

    public void bind(HeroModel dc) {
        hero_name.setText(dc.getName());
        real_name.setText(dc.getRealname());
        power.setText(dc.getPower());

        Glide.with(itemView.getContext())
                .load(dc.getImage())
                .into(image);
        }
    }
