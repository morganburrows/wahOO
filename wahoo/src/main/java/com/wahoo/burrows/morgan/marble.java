package com.wahoo.burrows.morgan;


/**
 * <!-- begin-user-doc -->
 *     descriptor of marble class.
 *     every player should have exactly 4 marbles.
 *     any marble can be in one of three places - start pool, goal pool, or board (which are composed of spaces).
 *     every marble starts the game in its owners start pool.
 *     having all four marbles in the goal pool triggers victory.
 *     a marble has a corresponding space which it occupies.
 * <!--  end-user-doc  -->
 * @generated
 */
public class marble
{


	private space space;
	public int marbleID;
	public Player owner;
	public boolean inPlay;


	public marble(Player player, int ID){
		this.setOwner(player);
		this.setMarbleID(ID);
	}


	public String color;
	
	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return(this.color);
	}

	public space getSpace(){
		return this.space;
}
	public void setSpace() {
		for(space boardSpace : Board.getBoardInstance().boardArray){
			if(boardSpace.occupant.marbleID == this.marbleID){
				this.space = boardSpace;
			}
		}
	}


	public void setOwner(Player player){
		this.owner = player;
	}

	public Player getOwner(){
		return(this.owner);
	}

	public void setMarbleID(int ID){
		this.marbleID = ID;
	}

	public int getMarbleID(){
		return(this.marbleID);
	}

}

