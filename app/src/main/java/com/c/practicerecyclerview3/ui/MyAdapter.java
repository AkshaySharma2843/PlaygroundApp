package com.c.practicerecyclerview3.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.c.practicerecyclerview3.R;
import com.c.practicerecyclerview3.model.Avengers;
import com.c.practicerecyclerview3.model.DC;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<Object> allHeroes;

    static int MARVEL = 1;
    static int DC = 2;

    public MyAdapter(ArrayList<Object> allHeroes) {
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
                MyViewHolder myViewHolder = (MyViewHolder) holder;
                Avengers avengers = (Avengers)allHeroes.get(position);
                myViewHolder.bind(avengers);
            }
            else{
                MyDcViewHolder myDcViewHolder = (MyDcViewHolder) holder;
                com.c.practicerecyclerview3.model.DC dc = (DC) allHeroes.get(position);
                myDcViewHolder.bind(dc);
            }
    }

    @Override
    public int getItemCount() {
        return allHeroes.size();
    }

    @Override
    public int getItemViewType(int position) {
        if(allHeroes.get(position) instanceof Avengers){
            return MARVEL;
       }
       else
       {
           return  DC;
       }
    }
}
