package com.wahoo.burrows.morgan;


//Class for the game board.
//board consists of an array of spaces
//48 spaces in length.
//board is a singleton, so that every player interacts with the same board.
public class Board
{

	public space[] boardArray;

	//function to create the board array.
	//to facilitate the placement of player-specific starting points, begins at 1.
	private void makeBoard(){
		for(int i = 1; i <= 48; i++ ){
			boardArray[i] = new space(i);
		}
//		for(Player player : ){
//
//		}
	}

	private static final Board instance = new Board();

	//constructor for Board.
	//simply calls make board to create the array and populate it.
	private Board(){
		makeBoard();
	}

	public Board getBoardInstance(){
		return instance;
	}

	//Function to advance a marble along the board.
	//copy the occupying marble to the new space.
	//remove the occupant from the old space.
	public void moveMarble(space currentSpace, int distance) {

		boardArray[currentSpace.place + distance].occupant = currentSpace.getOccupant();
		currentSpace.occupant = null;
	}

}

