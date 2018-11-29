package com.wahoo.burrows.morgan;


public class MarblesOnBoardState implements PlayerState{

    @Override
    public void takeTurn(Player player){
        int roll = player.rollDice();
        if(roll == 6){
            if(!player.putInPlay(player, player.spool.getMarble())){
                marble marble = player.ppool.getLeader(player.ppool.playPool);
                player.moveMarble(marble, roll);
            }
        }else if(roll == 1){
            player.putInPlay(player, player.spool.getMarble());
        }else{
            marble marble = player.ppool.getLeader(player.ppool.playPool);
            if(!player.moveMarble(marble, roll)){
                player.gpool.addOccupant(marble);
            }
        }
    }
}
