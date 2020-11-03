package com.company;

public class Violin extends StringedInstruments {

    public Violin(String PlayerName){

        setPlayerName(PlayerName);

    }

    @Override
    public String toString() {
        return String.format("%s is playing Violin", getPlayerName());
    }

    @Override
    public void Play(String place) {
        MessageCentre.DebugMessage(String.format("I am Playing %s", place));
    }
}
