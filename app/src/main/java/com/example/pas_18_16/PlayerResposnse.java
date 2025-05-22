package com.example.pas_18_16;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class PlayerResposnse {
    @SerializedName("player")
    private List<Player> player;

    public List<Player> getPlayer() {
        return player;
    }
}
