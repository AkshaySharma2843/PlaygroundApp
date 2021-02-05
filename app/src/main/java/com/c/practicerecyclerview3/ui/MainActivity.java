package com.c.practicerecyclerview3.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.c.practicerecyclerview3.R;
import com.c.practicerecyclerview3.data.HeroesApiServices;
import com.c.practicerecyclerview3.data.RetrofitFactory;
import com.c.practicerecyclerview3.model.HeroModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Retrofit retrofit;
    HeroesApiServices heroesApiServices;
    ProgressBar progressBar;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createSharedPreferences();
        initView();
        fetchHeroesData();
    }

    private void createSharedPreferences() {
        sharedPreferences = getSharedPreferences("hero_app_preference", MODE_PRIVATE);
    }

    private void fetchHeroesData() {
        progressBar.setVisibility(View.VISIBLE);
         retrofit = new RetrofitFactory().createRetrofitInstance();
         heroesApiServices = retrofit.create(HeroesApiServices.class);

        Call<List<HeroModel>> listCall = heroesApiServices.getHeroData();
        listCall.enqueue(new Callback<List<HeroModel>>() {
            @Override
            public void onResponse(Call<List<HeroModel>> call, Response<List<HeroModel>> response) {
                if(response.isSuccessful()){
                    if(response.body()!=null){
                        if(!response.body().isEmpty()){
                            drawRecycler(response.body());
                        }
                    }
                    else{
                        Toast.makeText(MainActivity.this, "No data found", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {

                }
                progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onFailure(Call<List<HeroModel>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Some error occured", Toast.LENGTH_SHORT).show();
                progressBar.setVisibility(View.GONE);

            }
        });


    }


    private void drawRecycler(List<HeroModel> allHeroes) {
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    recyclerView.setAdapter(new MyAdapter(allHeroes));
    }

    private void initView() {
        recyclerView  = findViewById(R.id.recV);
        progressBar = findViewById(R.id.progressBar);
    }
}