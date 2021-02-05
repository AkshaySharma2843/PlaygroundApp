package com.c.practicerecyclerview3.ui.onboarding.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.c.practicerecyclerview3.ui.onboarding.onboardingfragments.OneFragment;

public class OnboardingAdapter extends FragmentPagerAdapter {

    public OnboardingAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        OneFragment oneFragment = new OneFragment(position);
        return oneFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
