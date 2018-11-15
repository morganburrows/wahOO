package com.wahoo.burrows.morgan;

public class DisplayContext implements DisplayState {

    private DisplayState Dstate;

    public void setDstate(DisplayState state){
        this.Dstate = state;
    }

    public DisplayState getDstate(){
        return this.Dstate;
    }

    @Override
    public void changeDisplay() {
        this.Dstate.changeDisplay();
    }
}
