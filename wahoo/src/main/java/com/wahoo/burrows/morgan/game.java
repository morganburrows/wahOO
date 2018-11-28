package com.wahoo.burrows.morgan;


import java.util.HashSet;
import java.util.Set;

/**
 * <!-- begin-user-doc -->
 *     main driving logic for game.
 *     handles initialization of games, turns, and win conditions
 * <!--  end-user-doc  -->
 * @generated
 */

public class game
{

	public game Game;
	public Set<Player> playerSet = new HashSet<>();

	public void setupPlayers(){

		Player player1 = new Player(1);
		Player player2 = new Player(2);
		Player player3 = new Player(3);
		Player player4 = new Player(4);

		player1.setName("Me");
		player2.setName("robot Tom");
		player3.setName("robot Dick");
		player4.setName("robot Harry");

		playerSet.add(player1);
		playerSet.add(player2);
		playerSet.add(player3);
		playerSet.add(player4);

	}

	public void takeTurn(Player player){

		if(player.spool.getNumOccupants() == 4){

			int roll = player.rollDice();

			 if(roll == 1 || roll == 6){

			 	//player.spool.

			 }
		}
	}



	public game(){
		setupPlayers();
	}


	public void startGame() {



	}

	/**
	 * <!-- begin-user-doc -->
	 *     	 create instance of game
	 * 		 prompt user for num players
	 * 		 get players' color choices
	 * 		 initialize singleton of board
	 * 		 initialize num players pools
	 * 		 fill pools with marbles of respective colors
	 * 		 begin play
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void endGame(game parameter) {
		// TODO implement me
	}


	public void pauseGame(game parameter) {
		// TODO implement me
	}


	public void restartGame(game parameter) {
		// TODO implement me
	}

}

