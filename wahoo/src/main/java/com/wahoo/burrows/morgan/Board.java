package com.wahoo.burrows.morgan;


import java.util.ArrayList;

//Class for the game board.
//board consists of an array of spaces
//48 spaces in length.
//board is a singleton, so that every player interacts with the same board.
public class Board
{

	public ArrayList<space> boardArray = new ArrayList<>();

	//function to create the board array.
	private void makeBoard(){
		for(int i = 0; i <= 47; i++ ){
			boardArray.add(i, new space(i));
		}
	}

	private static final Board instance = new Board();

	//constructor for Board.
	//simply calls make board to create the array and populate it.
	private Board(){
		makeBoard();
	}

	//access the game board.
	public static Board getBoardInstance(){
		return instance;
	}



}

