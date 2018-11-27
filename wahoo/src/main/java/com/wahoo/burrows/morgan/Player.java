package com.wahoo.burrows.morgan;

/**
 * <!-- begin-user-doc -->
 *     Player class. handles player objects like marbles, player properties, and player abilities.
 * <!--  end-user-doc  -->
 * @generated
 */



 public class Player extends game
{

	
	public String Name;
	public int playerID;
	public int marblesInGoal;
	public int marblesInStart;


	public Player(int playerID){
		super();

	}

	public void makePools(Player player){
		start startPool = new start(player);
		startPool.populate(this.playerID);
		Goal goalPool = new Goal();
	}

	public int getMarblesInGoal(){

		return 0;
	}
	
	public void setName(String name) {
		this.Name = name;
	}

	public String getName() {
		return(this.Name);
	}

	public int rollDice(){
		dice dice = new dice();
		return dice.generateNumber();
	}

}

