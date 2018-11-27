package com.wahoo.burrows.morgan;


 public class Player extends game
{

	
	public String Name;
	public int playerID;
	public int marblesInGoal;
	public int marblesInStart;

	start startPool = new start();
	Goal goalPool = new Goal();


	public Player(){
		super();
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

