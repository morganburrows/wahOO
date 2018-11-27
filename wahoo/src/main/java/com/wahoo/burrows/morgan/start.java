package com.wahoo.burrows.morgan;


public class start implements pool
{
	public space[] startArray;
	Player owner;

	@Override
	public void setNumOccupants(){

		for(int i = 0; i < 4; i++){
			startArray[i] = new space(i*10);
		}
	}

	@Override
	public int getNumOccupants(){
		return startArray.length;
	}

	public start(){
		super();
	}


}

