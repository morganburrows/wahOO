package com.wahoo.burrows.morgan;

import java.util.Random;

public class NoMarblesInStartState implements PlayerState{

    @Override
    public int rollDice(){
        Random random = new Random();
        int roll = random.nextInt(6) + 1;
        return roll;

    }

    @Override
    public void putInPlay(){
    }
}
