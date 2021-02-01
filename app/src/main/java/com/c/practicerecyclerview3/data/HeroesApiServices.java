package com.c.practicerecyclerview3.data;

import com.c.practicerecyclerview3.model.HeroModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HeroesApiServices {

    @GET("b/Z3K3")
    Call<List<HeroModel>> getHeroData();
}
