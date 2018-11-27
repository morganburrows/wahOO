package com.wahoo.burrows.morgan;


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

	public void setupPlayers(){

		Player player1 = new Player(1);
		Player player2 = new Player(2);
		Player player3 = new Player(3);
		Player player4 = new Player(4);

		player1.setName("Me");
		player1.makePools(player1);
		player2.setName("robot Tom");
		player3.setName("robot Dick");
		player4.setName("robot Harry");

	}



	public game(){
		super();
	}


	public void startGame() {

		setupPlayers();

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

