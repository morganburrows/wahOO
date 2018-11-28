package com.wahoo.burrows.morgan;


import java.util.*;

public class start
{
	private ArrayList<marble> startPool = new ArrayList<>();
	private Player owner;

	//set ownership of a start pool. each player has a pool
	public void setOwner(Player owner){
		this.owner = owner;
	}

	//get ownership of a pool
	public Player getOwner(){
		return owner;
	}

	//Using the previously declared array list, fill with exactly four marbles.
	//Each space is unique, and tied to the player via playerID
	public void makePool(Player owner){
		for(int i = 0; i < 4; i++){
			startPool.add(i, new marble(owner,(owner.playerID*100)+1));
		}
	}

	public marble getMarble(){
		marble marble = startPool.get(0);
		startPool.remove(0);
		return marble;
	}

	public int getNumOccupants(){
		return startPool.size();
	}


	//constructor for a startpool.
	//each pool has an owner, spaces, and marbles.
	//set the owner of the pool, fill the pool with spaces. fill the spaces with marbles.
	public start(Player owner){
		setOwner(owner);
		makePool(owner);
	}


}

