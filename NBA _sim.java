package hw4_1;
import java.util.*;
public class NBA {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//initialize variables
		String ifAddPlayer;
		String playerName;
		int heatWin = 0;
		int heatLoss = 0;
		int spursWin = 0;
		int spursLoss = 0;
		
		//creates the team Heat
		System.out.println("Create the NBA team for the Heat");
		NBATeam heat = new NBATeam("Heat");
		System.out.print("Add a player to the Heat? (yes/no): ");
		ifAddPlayer = sc.next();
		
		//prompts user to add players
		while (ifAddPlayer.equalsIgnoreCase("yes")) {
			System.out.print("Enter the name: ");
			playerName = sc.next();
			heat.addAPlayer(playerName);
			System.out.print("Add more players? (yes/no): ");
			ifAddPlayer = sc.next();
		}
		
		//creates the team Spurs
		System.out.println("Create the NBA team for the Spurs");
		NBATeam spurs = new NBATeam("Spurs");
		System.out.print("Add a player to the Spurs? (yes/no): ");
		ifAddPlayer = sc.next();
		
		//prompts user to add players
		while (ifAddPlayer.equalsIgnoreCase("yes")) {
			System.out.print("Enter the name: ");
			playerName = sc.next();
			spurs.addAPlayer(playerName);
			System.out.print("Add more players? (yes/no): ");
			ifAddPlayer = sc.next();
		}
		
		System.out.println("Game on now");
		
		//Generates random number to determine who wins
		Random rand = new Random();
		while(heatWin < 4 && spursWin < 4) {
		double whoWins = rand.nextDouble();
		if(whoWins > 0.5) {		//If number is greater than 0.5, Heat win
			heatWin++;
			spursLoss++;
		}else {					//If number is less than 0.5, Spurs win
			spursWin++;
			heatLoss++;
		}
		}
		
		if(heatWin > spursWin) {
			System.out.println("Heat win the series!");
		}else {
			System.out.println("Spurs win the series!");
		}
		
		//Sends number of wins and losses for each team
		heat.getWins(heatWin);			
		heat.getLosses(heatLoss);
		spurs.getWins(spursWin);
		spurs.getLosses(spursLoss);
		
		//Prints the team and the game results
		System.out.println(heat.toString());
		System.out.println(spurs.toString());
	}

}
