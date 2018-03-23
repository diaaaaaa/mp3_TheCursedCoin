package com.example.mp3_TheCursedCoin.mp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JackSparrow {

    private Compass compass;

    public JackSparrow(Compass compass) {
        this.compass = compass;
    }

    public String findCursedCoin(){
        return compass.findCoin();
    }

}
