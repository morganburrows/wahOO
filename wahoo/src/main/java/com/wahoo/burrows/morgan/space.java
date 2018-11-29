package com.wahoo.burrows.morgan;


public class space extends game
{
	public int location;
	public marble occupant;

	public space(int ID){
		this.location = ID;
	}

	public marble getOccupant() {
		return(this.occupant);
	}

	public void setOccupant(marble newOccupant) {
		this.occupant = newOccupant;
	}

}

