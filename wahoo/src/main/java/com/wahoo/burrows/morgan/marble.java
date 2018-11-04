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
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Players Team;

	/**
	 * <!-- begin-user-doc -->
	 *     four marbles make up a team and will share the same player.color attribute
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public space Space;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int ID;

	/**
	 * <!-- begin-user-doc -->
	 *     each marble should have a unique ID.
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public marble(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public int Color;
	
	public void setColor(marble parameter) {
		//this.Color = user input
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int getColor(marble parameter) {
		return(this.Color);
	}

}

