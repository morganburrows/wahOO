package com.wahoo.burrows.morgan;

public class MarblesOnBoardState implements PlayerState{

    @Override
    public void takeTurn(Player player){
        for(marble marble : player.ppool.playPool){
            if(marble.owner == player){

            }
        }
    }
}
