package com.wahoo.burrows.morgan;


//import sun.jvm.hotspot.gc.shared.Space;

import java.lang.reflect.Array;


public class Board
{

	
	space[] boardArray;

	public void makeBoard(){

		for(int i = 0; i < 47; i++ ){
			boardArray[i] = new space(i);
		}
	}

	public Board(){
		super();
	}

	public void moveMarble(space parameter, int parameter2) {
		// TODO implement me
	}

}

