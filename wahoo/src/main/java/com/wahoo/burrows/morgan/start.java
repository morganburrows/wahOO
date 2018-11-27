package com.wahoo.burrows.morgan;


public class start
{
	public space[] startArray;
	Player owner;

	public void setOwner(Player owner){
		this.owner = owner;
	}
	public Player getOwner(){
		return owner;
	}

	public void populate(int playerID){
		for(int i = 0; i < 4; i++){
			startArray[i] = new space(playerID*100);
		}
	}


	public int getNumOccupants(){
		return startArray.length;
	}

	public start(Player owner){
		super();
		setOwner(owner);
	}


}

