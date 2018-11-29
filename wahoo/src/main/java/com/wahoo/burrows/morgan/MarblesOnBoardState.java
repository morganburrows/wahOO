package com.wahoo.burrows.morgan;


public class MarblesOnBoardState implements PlayerState{

    @Override
    public void takeTurn(Player player){
        int roll = player.rollDice();
        if(roll == 1){
            if(!player.putInPlay(player, player.spool.getMarble())){
                marble marble = player.ppool.getLeader(player.ppool.playPool);
                player.moveMarble(marble, roll);
            }
        }else{
            marble marble = player.ppool.getLeader(player.ppool.playPool);
            boolean inGoal = player.moveMarble(marble, roll);
            if(inGoal){
                marble.inPlay = false;
                marble.setSpace(null);
                player.gpool.addOccupant(marble);
                player.ppool.playPool.remove(marble);
            }
        }
    }
}
