package com.example.pas_18_16;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {
    @GET("search_all_teams.php?l=English%20Premier%20League")
    Call<TeamResponse> getEnglishPremierleague(@Query("las") String league);

    @GET("lookup_all_players.php")
    Call<PlayerResposnse> getPlayer(@Query("id") String id); //

}