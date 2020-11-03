package com.company;

public class Drums extends PercussionInstrument{

    public Drums(){

        setPlayerName("Unknown player name");
    }

    public Drums(String PlayerName){

        setPlayerName(PlayerName);

    }

    @Override
    public String toString() {
        return String.format("%s is playing Drums", getPlayerName());
    }

    @Override
    public void Play(String place) {
        MessageCentre.DebugMessage(String.format("I am Playing %s", place));
    }

}
