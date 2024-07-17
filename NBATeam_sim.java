package hw4_1;

import java.util.ArrayList;

public class NBATeam {
	//instance variables
	private String sTeamName;
	private int nWin;
	private int nLoss;
	
	//creates array list of players
	private ArrayList<String> playerArray = new ArrayList<String>();
	
	//constructor
	public NBATeam(String sTeamName) {
		this.sTeamName = sTeamName;
	}
	
	//adds player to playerArray
	public ArrayList addAPlayer(String playerName) {
		playerArray.add(playerName);
		return playerArray;
		
		
	}
	
	//returns wins
	public int getWins(int win) {
		nWin = win;
		return nWin;
	}
	
	//returns losses
	public int getLosses(int loss) {
		nLoss = loss;
		return nLoss;
	}
	
	//converts team, playerArray, wins, and losses to a string
	public String toString() {
		return sTeamName + " " + playerArray + " Wins: " + nWin + " Losses: " + nLoss;
		
	}

}
