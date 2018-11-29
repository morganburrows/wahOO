package com.wahoo.burrows.morgan;

import java.util.Random;
import java.util.Set;

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
	public int startSpace;
	start spool;
	Goal gpool;
	Play ppool;


	//constructor for a player.
	//each player starts the game with a full pool of marbles.
	//each player starts the game with an empty pool at the "end" of the track.
	//each player starts the game with an empty pool of marbles that are in play
	public Player(int playerID){
		this.playerID = playerID;
		this.spool = new start(this);
		this.gpool = new Goal(this);
		this.ppool = new Play(this);
	}

	public void setStartSpace(int space){
		this.startSpace = space;
	}

	public int getStartSpace(){
		return this.startSpace;
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

	public void putInPlay(Player player, marble marble){
		if(!marble.inPlay){
			Board board = Board.getBoardInstance();
			board.boardArray.get(player.getStartSpace()).setOccupant(marble);
			player.ppool.addMarble(marble);
			marble.inPlay = true;
			marble.setSpace();
		}
	}

	//Function to advance a marble along the board.
	//copy the occupying marble to the new space.
	//remove the occupant from the old space.
	public void moveMarble(space currentSpace, int distance) {
		Board.getBoardInstance().boardArray
				.set(currentSpace.location + distance, currentSpace)
				.occupant = currentSpace.getOccupant();
		currentSpace.occupant = null;
	}

}

