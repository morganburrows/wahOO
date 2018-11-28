package com.wahoo.burrows.morgan;

import java.util.Random;

/**
 * <!-- begin-user-doc -->
 *     Player class. handles player objects like marbles, player properties, and player abilities.
 * <!--  end-user-doc  -->
 * @generated
 */



 public class Player
{

	
	public String Name;
	public int playerID;
	start spool;
	Goal gpool;


	//constructor for a player.
	//each player starts the game with a full pool of marbles.
	//each player starts the game with an empty pool at the "end" of the track.
	public Player(int playerID){
		this.spool = new start(this);
		this.gpool = new Goal(this);
	}


	//get the number of marbles a players goal.
	//this function is used to check for the win condition.
	public int getMarblesInGoal(){

		return gpool.getNumOccupants();
	}

	//set the name of a player.
	//used for integration to the UI
	public void setName(String name) {
		this.Name = name;
	}

	//get the name of a player
	public String getName() {
		return(this.Name);
	}

	//generate a random number between 1 and 6
	//this number is the virtual dice roll used to advance a marble.
	public int rollDice(){
		Random random = new Random();
		int roll = random.nextInt(6) + 1;
		return roll;

	}

}

