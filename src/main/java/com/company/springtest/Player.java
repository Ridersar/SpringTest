package com.company.springtest;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Radio> radioList = new ArrayList<>();

    public Player() {
    }

    public Player(List<Radio> radioList) {
        this.radioList = radioList;
    }

    public List<Radio> getRadioList() {
        return radioList;
    }

    public void setRadioList(List<Radio> radioList) {
        this.radioList = radioList;
    }

    public void playRadio() {
        for (Radio radio : radioList)
            System.out.println("Playing: " + radio.getRadio());
    }
}
