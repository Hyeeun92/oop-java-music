package com.company;

public class Musician {

    private String PlayerName;
    private String place;

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String PlayerName) {
        this.PlayerName = PlayerName;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Musician(String PlayerName, String place){

        setPlayerName(PlayerName);
        setPlace(place);
    }

    @Override
    public String toString() {
        return String.format("%s is playing in %s", PlayerName, place);
    }

}
