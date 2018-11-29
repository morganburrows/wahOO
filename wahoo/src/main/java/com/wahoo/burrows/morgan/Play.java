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
        playPool.add(marble);
    }

    public marble getLeader(ArrayList<marble> pool){
        marble leader = pool.get(0);
        for(marble marble: pool){
            if(pool.indexOf(marble) > pool.indexOf(leader)){
                leader = marble;
            }
        }
        return leader;
    }

}
