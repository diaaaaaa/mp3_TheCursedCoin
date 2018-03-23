package com.example.mp3_TheCursedCoin.mp1;

import org.springframework.stereotype.Component;

@Component
public class Compass {

    private Coin coin;

    public Compass(Coin coin) {
        this.coin = coin;
    }

    public String findCoin(){
        return coin.getCoin();

    }
}
