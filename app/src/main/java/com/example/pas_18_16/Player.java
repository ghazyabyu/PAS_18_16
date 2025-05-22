package com.example.pas_18_16;

import com.google.gson.annotations.SerializedName;

public class Player {
    @SerializedName("strPlayer")
    private String strPlayer;

    @SerializedName("strTeam")
    private String strTeam;

    @SerializedName("strPosition")
    private String strPosition;

    public String getStrPlayer() {
        return strPlayer;
    }

    public String getStrTeam() {
        return strTeam;
    }

    public String getStrPosition() {
        return strPosition;
    }
}
