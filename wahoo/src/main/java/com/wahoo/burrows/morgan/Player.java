package com.wahoo.burrows.morgan;


 public class Player extends game
{

	
	public String Name;
	public int playerID;
	public int marblesInGoal;
	public int marblesInStart;


	public Player(){
		super();
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

