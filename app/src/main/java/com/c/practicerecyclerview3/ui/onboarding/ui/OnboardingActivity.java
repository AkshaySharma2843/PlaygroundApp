package com.c.practicerecyclerview3.ui.onboarding.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.c.practicerecyclerview3.R;
import com.c.practicerecyclerview3.ui.onboarding.adapter.OnboardingAdapter;
import com.c.practicerecyclerview3.ui.onboarding.onboardingfragments.OneFragment;

public class OnboardingActivity extends AppCompatActivity {

    ViewPager viewPager;
    OnboardingAdapter onboardingAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
        viewPager = findViewById(R.id.viewpager);
        setViewPagerWithFragments();
    }

    private void setViewPagerWithFragments() {
        onboardingAdapter = new OnboardingAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(onboardingAdapter);

    }
}