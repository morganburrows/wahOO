package com.wahoo.burrows.morgan;

public class PlayerContext implements PlayerState {

    private PlayerState state;

    public void setState(PlayerState state) {
        this.state = state;
    }

    public PlayerState getState() {
        return state;
    }

    @Override
    public void doAction(){
        this.state.doAction();
    }
}
