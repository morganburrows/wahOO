package com.wahoo.burrows.morgan;

import java.util.Random;

public class AllMarblesInStartState implements PlayerState {

    Player player;

    @Override
    public int rollDice(){
        Random random = new Random();
        int roll = random.nextInt(6) + 1;
        return roll;

    }

    @Override
    public void putInPlay(){
        int roll = player.rollDice();
        if(roll == 1 || roll == 6){
            player.putInPlay(player, player.spool.getMarble());
        }
    }
}
