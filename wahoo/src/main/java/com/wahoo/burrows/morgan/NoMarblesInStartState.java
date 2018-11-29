package com.wahoo.burrows.morgan;


public class NoMarblesInStartState implements PlayerState{

    @Override
    public void takeTurn(Player player){
        int roll = player.rollDice();
        marble marble = player.ppool.getBehind(player.ppool.playPool);
        player.moveMarble(marble, roll);
    }
}
