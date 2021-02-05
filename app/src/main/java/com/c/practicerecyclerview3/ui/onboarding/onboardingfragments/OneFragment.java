package com.c.practicerecyclerview3.ui.onboarding.onboardingfragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.c.practicerecyclerview3.R;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class OneFragment extends Fragment {

    ConstraintLayout cl;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ArrayList<Integer> colors;
    private int position;
    public OneFragment(int postion) {
        this.position = postion;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_one, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        colors = new ArrayList<Integer>();
        colors.add(R.color.white);
        colors.add(R.color.black);
        colors.add(R.color.teal_200);
        cl = view.findViewById(R.id.cl_bg);
        cl.setBackgroundColor(ContextCompat.getColor(getContext(), colors.get(position)));
    }
}