package com.wahoo.burrows.morgan;

import java.util.ArrayList;

public class Goal
{
	private ArrayList<marble> goalPool = new ArrayList<>();
	private Player owner;

	//set ownership of a pool
	public void setOwner(Player owner){
		this.owner = owner;
	}

	//get ownership of a pool
	public Player getOwner(){
		return owner;
	}

	public void addOccupant(marble marble){
		goalPool.add(marble);
	}


	public int getNumOccupants(){
		return goalPool.size();
	}

	public Goal(Player owner){
		setOwner(owner);
	}



}

