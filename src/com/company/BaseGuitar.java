package com.company;

public class BaseGuitar extends StringedInstruments{

    public BaseGuitar(){

        setPlayerName("Unknown player name");
    }

    public BaseGuitar(String PlayerName){

        setPlayerName(PlayerName);

    }

    @Override
    public String toString() {
        return String.format("%s is playing Base Guitar", getPlayerName());
    }

    @Override
    public void Play(String place) {
        MessageCentre.DebugMessage(String.format("I am Playing %s", place));
    }
}
