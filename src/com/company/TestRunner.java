package com.company;

public class TestRunner {

    public void Run() {

        RunBands();
        RunOrchestra();
        RunMusician();
    }

    public void RunBands(){
        BaseGuitar baseGuitar1 = new BaseGuitar("Guitar1");
        MessageCentre.DebugMessage(baseGuitar1.toString());
        baseGuitar1.Play("in the band");
        Drums drum1 = new Drums("Drum1");
        MessageCentre.DebugMessage(drum1.toString());
        drum1.Play("in the band");






    }

    public void RunOrchestra(){
        Violin violin1 = new Violin("violin1");
        MessageCentre.DebugMessage(violin1.toString());
        violin1.Play("in the orchestra");

    }

    public void RunMusician(){

        Musician musician1 = new Musician("Musician1","band");
        System.out.println(musician1.toString());


    }
}
