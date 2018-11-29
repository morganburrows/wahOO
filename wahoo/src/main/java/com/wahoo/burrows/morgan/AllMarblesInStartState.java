package com.wahoo.burrows.morgan;


public class AllMarblesInStartState implements PlayerState {

    @Override
    public void takeTurn(Player player){
        int roll = player.rollDice();
        if(roll == 1 || roll == 6) {
            player.putInPlay(player, player.spool.getMarble());
        }

    }
}
