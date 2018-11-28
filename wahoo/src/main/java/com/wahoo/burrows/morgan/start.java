package com.wahoo.burrows.morgan;


import java.util.*;

public class start
{
	Set<space> startPool = new HashSet<>();
	Player owner;

	//set ownership of a start pool. each player has a pool
	public void setOwner(Player owner){
		this.owner = owner;
	}

	//get ownership of a pool
	public Player getOwner(){
		return owner;
	}


	//Using the previously declared empty set, fill the set with exactly four spaces.
	//Each space is unique, and tied to the player via playerID
	public void makePool(int playerID){
		for(int i = 0; i < 4; i++){
			startPool.add(new space((playerID*100)+i));
		}
	}

	//populate the above set of spaces with marbles.
	//each marble is unique and occupies a space in the set.
	public void populatePool(int playerID){
		for(space space : startPool){
			space.setOccupant(space, new marble(owner));
		}
	}

	public void removeOccupant(){

	}


	public int getNumOccupants(){
		return startPool.size();
	}


	//constructor for a startpool.
	//each pool has an owner, spaces, and marbles.
	//set the owner of the pool, fill the pool with spaces. fill the spaces with marbles.
	public start(Player owner){
		setOwner(owner);
		makePool(owner.playerID);
		populatePool(owner.playerID);
	}


}

