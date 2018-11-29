package com.wahoo.burrows.morgan;


public class NoMarblesInStartState implements PlayerState{

    @Override
    public void takeTurn(Player player){
        int roll = player.rollDice();
        if(roll%2 == 0){
            marble marble = player.ppool.getBehind(player.ppool.playPool);
            if(!player.moveMarble(marble, roll)){
                player.gpool.addOccupant(marble);
            }
        }else{
            marble marble = player.ppool.getLeader(player.ppool.playPool);
            if(!player.moveMarble(marble, roll)){
                player.gpool.addOccupant(marble);
            }
        }

    }
}
