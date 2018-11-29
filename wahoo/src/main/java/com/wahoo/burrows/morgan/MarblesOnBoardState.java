package com.wahoo.burrows.morgan;


public class MarblesOnBoardState implements PlayerState{

    @Override
    public void takeTurn(Player player){
        marble marble = player.ppool.getLeader(player.ppool.playPool);
        player.moveMarble(marble.getSpace(), player.rollDice());
    }
}
