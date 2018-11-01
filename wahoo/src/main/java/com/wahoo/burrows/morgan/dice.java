package com.wahoo.burrows.morgan;
import java.util.Random;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class dice extends Player
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public dice(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int generateNumber() {

		Random random = new Random();
		int roll = random.nextInt(6) + 1;

		return roll;
	}

}

