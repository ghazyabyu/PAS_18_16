package com.example.pas_18_16;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class Listolahraga_Fragment extends Fragment{
    RecyclerView rvlistolahraga;
    ProgressBar progressBar;
    AdapterPlayer adapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_listolahraga, container, false);
        rvlistolahraga = view.findViewById(R.id.rvlistolahraga);
        progressBar = view.findViewById(R.id.progressBar);
        rvlistolahraga.setLayoutManager(new LinearLayoutManager(getContext()));

        APIService api = RetrofitClient.getInstance().create(APIService.class);
        fetchPlayer(api);
        return view;
}
    private void fetchPlayer(APIService api) {
        api.getPlayer("Tes").enqueue(new Callback<TeamResponse>() {
            @Override
            public void onResponse(Call<TeamResponse> call, Response<TeamResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<Team> players = response.body().getTeams();
                    adapter = new AdapterPlayer(players);
                    rvlistolahraga.setAdapter(adapter);
                    rvlistolahraga.setVisibility(View.VISIBLE);
                    progressBar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<TeamResponse> call, Throwable t) {
                Log.e("API_ERROR", t.getMessage());
            }
        });
    }
}
