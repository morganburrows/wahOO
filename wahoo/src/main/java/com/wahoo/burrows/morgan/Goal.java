package com.wahoo.burrows.morgan;

import java.util.HashSet;
import java.util.Set;

public class Goal
{
	public Set<space> goalPool = new HashSet<>();
	Player owner;

	//set ownership of a pool
	public void setOwner(Player owner){
		this.owner = owner;
	}

	//get ownership of a pool
	public Player getOwner(){
		return owner;
	}

	public void makePool(int playerID){
		for(int i = 0; i < 4; i++){
			goalPool.add(new space((playerID*1000)+i));
		}
	}

	//populate the set of spaces with marbles.
	//each marble is unique and occupies a space in the set.
	public void populatePool(int playerID){
		for(space space : goalPool){
			space.setOccupant(space, new marble(owner));
		}
	}

	public void addOccupant(){

	}


	public int getNumOccupants(){
		return 0;
	}

	public Goal(Player owner){
		setOwner(owner);
		makePool(owner.playerID);
		populatePool(owner.playerID);
	}



}

