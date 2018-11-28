package com.wahoo.burrows.morgan;

public class AllMarblesInStartState implements PlayerState {

    Player player;

    @Override
    public void doAction(){
        int roll = player.rollDice();
        if(roll == 1 || roll == 6){
            player.putInPlay(player, player.spool.getMarble());
        }
    }
}
