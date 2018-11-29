package com.wahoo.burrows.morgan;

import java.util.ArrayList;

public class Play {

    public ArrayList<marble> playPool = new ArrayList<>();
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
        playPool.add(0,marble);
    }

    public marble getLeader(ArrayList<marble> pool){
        marble leader = pool.get(0);
        System.out.println("marble in play's space: "+leader.getSpace());
        try {
            for(marble marble: pool){
                if(marble.getSpace().location > leader.getSpace().location){
                    leader = marble;
                }
            }
        } catch (NullPointerException e){
            e.getCause();
        }
        return leader;
    }

    public marble getBehind(ArrayList<marble> pool){
        marble leader = pool.get(0);
        marble trailer = leader;
        for(marble marble : pool){
            if(marble.getSpace().location > leader.getSpace().location){
                trailer = leader;
                leader = marble;
            }
        }
        return trailer;
    }

}
