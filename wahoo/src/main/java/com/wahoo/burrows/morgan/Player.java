package com.wahoo.burrows.morgan;


public class Player extends game
{

	
	public String Name;
	public int marblesInGoal;
	public int marblesInStart;


	public Player(){
		super();
	}


	
	public String setName(String name) {
		this.Name = name;
	}

	public String getName(Player Player) {
		return(Player.Name);
	}

	public int rollDice(){
		dice dice = new dice();
		return dice.generateNumber();
	}

}

