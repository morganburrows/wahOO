package com.wahoo.burrows.morgan;


/**
 * <!-- begin-user-doc -->
 *     descriptor of marble class.
 *     every player should have exactly 4 marbles.
 *     any marble can be in one of three places - start pool, goal pool, or board (which are composed of spaces).
 *     every marble starts the game in its owners start pool.
 *     having all four marbles in the goal pool triggers victory.
 *     a marble has a corresponding member of the space class which it occupies.
 * <!--  end-user-doc  -->
 * @generated
 */

public class marble extends Player
{


	public space space;
	public int marbleID;


	public marble(){
		super();
	}


	public int Color;
	
	public void setColor(int color) {
		this.Color = color;
	}

	public int getColor(marble parameter) {
		return(this.Color);
	}

}

