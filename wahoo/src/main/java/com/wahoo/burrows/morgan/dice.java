package com.wahoo.burrows.morgan;
import java.util.Random;

public class dice extends Player
{

	public dice(){
		super();
	}

	public int generateNumber() {

		Random random = new Random();
		int roll = random.nextInt(6) + 1;

		return roll;
	}
}

