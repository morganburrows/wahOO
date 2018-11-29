package com.wahoo.burrows.morgan;

import java.util.ArrayList;

public class Play {

    private ArrayList<marble> playPool = new ArrayList<>();
    Player owner;

    public void setOwner(Player owner){
        this.owner = owner;
    }

    public Player getOwner(){
        return owner;
    }

    public Play(Player owner){
        setOwner(owner);
    }

    public void addMarble(marble marble){
        playPool.add(marble);
    }

}
