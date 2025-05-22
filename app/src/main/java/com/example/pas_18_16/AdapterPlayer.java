package com.example.pas_18_16;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pas_18_16.AdapterPAS;
import com.example.pas_18_16.Player;
import com.example.pas_18_16.R;

import java.util.List;

public class AdapterPlayer extends RecyclerView.Adapter<AdapterPlayer.ViewHolder> {
    private List<Player> playerList;

    public AdapterPlayer(List<Player> playerList) {
        this.playerList = playerList;
    }

    @NonNull
    @Override
    public AdapterPlayer.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Player player = playerList.get(position);
        holder.tvTeam.setText(player.getStrTeam());
        holder.tvStadium.setText(player.getStrPosition());
        holder.tvplayer.setText(player.getStrPlayer());


    }

    @Override
    public int getItemCount() {
        return playerList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTeam, tvStadium, tvplayer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTeam = itemView.findViewById(R.id.tvteam);
            tvStadium = itemView.findViewById(R.id.tvstadium);
            tvplayer = itemView.findViewById(R.id.tvplayer);
        }
    }
}
