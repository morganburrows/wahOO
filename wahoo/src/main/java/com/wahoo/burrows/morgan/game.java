package com.wahoo.burrows.morgan;


import java.util.HashSet;
import java.util.Set;

/**
 * <!-- begin-user-doc -->
 *     main driving logic for game.
 *     handles initialization of games,
 *     initialization of players,
 *     turn logic, and win conditions
 * <!--  end-user-doc  -->
 * @generated
 */

public class game
{
	boolean winConditionMet = false;

	PlayerContext context = new PlayerContext();
	PlayerState AllMarblesInStart = new AllMarblesInStartState();
	PlayerState MarblesOnBoard = new MarblesOnBoardState();
	PlayerState NoMarblesInStart = new NoMarblesInStartState();
	PlayerState AllMarblesInGoal = new AllMarblesInGoalState();
	public Set<Player> playerSet = new HashSet<>();


	public game(){
		setupPlayers();
		startGame();
	}

	public void setupPlayers(){

		Player player1 = new Player(0);
		Player player2 = new Player(1);
		Player player3 = new Player(2);
		Player player4 = new Player(3);

		player1.setName("Me");
		player2.setName("robot Tom");
		player3.setName("robot Dick");
		player4.setName("robot Harry");

		playerSet.add(player1);
		playerSet.add(player2);
		playerSet.add(player3);
		playerSet.add(player4);

		for(Player player : playerSet){
			player.setStartSpace(player.playerID*12);
		}

	}

	public void setPlayerTurnLogic(Player player){

		if(player.spool.getNumOccupants() == 4){
			context.setState(AllMarblesInStart);
		} else if(player.spool.getNumOccupants() < 4){
			context.setState(MarblesOnBoard);
		} else if(player.spool.getNumOccupants() == 0 && player.gpool.getNumOccupants() < 4){
			context.setState(NoMarblesInStart);
		} else if(player.gpool.getNumOccupants() == 4){
			context.setState(AllMarblesInGoal);
		}
	}


	public void startGame() {
		while(!winConditionMet){
			for(Player player : playerSet){
				setPlayerTurnLogic(player);
				context.takeTurn(player);
			}
		}

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

