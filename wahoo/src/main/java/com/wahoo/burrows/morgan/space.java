package com.wahoo.burrows.morgan;


public class space extends game
{
	public int place;
	public marble occupant;

	public space(int ID){
		super();
		this.place = ID;
	}


	
	public marble getOccupant() {
		return(this.occupant);
	}

	public void setOccupant(space parameter, marble newOccupant) {
		this.occupant = newOccupant;
	}

}

