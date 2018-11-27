package com.wahoo.burrows.morgan;


public class Board
{

	public space[] boardArray;

	public void makeBoard(){

		for(int i = 0; i < 47; i++ ){
			boardArray[i] = new space(i);
		}
	}

	public Board(){
		super();
	}

	public void moveMarble(space currentSpace, int distance) {
		currentSpace.getOccupant()
	}

}

