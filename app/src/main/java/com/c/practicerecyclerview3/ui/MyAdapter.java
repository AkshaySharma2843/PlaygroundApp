package com.c.practicerecyclerview3.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.c.practicerecyclerview3.R;
import com.c.practicerecyclerview3.model.Avengers;
import com.c.practicerecyclerview3.model.DC;
import com.c.practicerecyclerview3.model.HeroModel;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<HeroModel> allHeroes;

    static int MARVEL = 1;
    static int DC = 2;

    public MyAdapter(List<HeroModel> allHeroes) {
        this.allHeroes = allHeroes;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType==MARVEL){
            return  new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_details, parent, false));
        }
        else{
            return new MyDcViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_dc, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            if(holder.getItemViewType() == MARVEL) {
                HeroModel avengersData = allHeroes.get(position);
                MyViewHolder myViewHolder = (MyViewHolder) holder;
                myViewHolder.bind(avengersData);
            }
            else{
                HeroModel dcData = allHeroes.get(position);
                MyDcViewHolder myDcViewHolder = (MyDcViewHolder) holder;
                myDcViewHolder.bind(dcData);
            }
    }

    @Override
    public int getItemCount() {
        return allHeroes.size();
    }

    @Override
    public int getItemViewType(int position) {
        if(allHeroes.get(position).getType().equals("Marvel")){
            return MARVEL;
       }
       else
       {
           return  DC;
       }
    }
}
