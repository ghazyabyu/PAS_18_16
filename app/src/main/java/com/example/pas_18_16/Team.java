package com.example.pas_18_16;

import com.google.gson.annotations.SerializedName;
public class Team {
    @SerializedName("strTeam")
    private String strTeam;

    @SerializedName("strStadium")
    private String strStadium;


    public String getStrTeam() {
        return strTeam;
    }

    public String getStrStadium() {
        return strStadium;
    }

}