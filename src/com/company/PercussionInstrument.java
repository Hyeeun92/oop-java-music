package com.company;

public abstract class PercussionInstrument {

    private String PlayerName;


    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String PlayerName) {
        this.PlayerName = PlayerName;
    }

    public abstract void Play(String place);
}
