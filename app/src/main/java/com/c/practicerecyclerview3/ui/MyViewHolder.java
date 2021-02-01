package com.c.practicerecyclerview3.ui;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.c.practicerecyclerview3.R;
import com.c.practicerecyclerview3.model.Avengers;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView name;
    TextView power;
    TextView location;
    TextView position;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.tv_name);
        power = itemView.findViewById(R.id.tv_power);
        location = itemView.findViewById(R.id.tv_location);
        position = itemView.findViewById(R.id.tv_position);
    }

    public void bind(Avengers avenger) {

        name.setText(avenger.getName());
        power.setText(avenger.getPower());
        location.setText(avenger.getLocation());
        position.setText(avenger.getPosition());
    }
}
