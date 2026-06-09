/*Question 11: Write a Java program to create a Player class and find the player with highest runs.
Description: Create a Player POJO class having playerId, playerName and runs. Initialize using constructor. Store 5 player objects in an array and find the player who scored maximum runs.
INPUT: Enter Player Details: Player1: 1 Virat 85 Player2: 2 Rohit 120 Player3: 3 KL 45 Player4: 4 Gill 95 Player5: 5 Hardik 60
OUTPUT: Highest Run Scorer: Rohit Runs: 120 */

import java.util.Scanner;
class Player
{
	private int playerId;
	private String playerName;
	private int runs;

	Player(int playerId, String playerName, int runs)
	{
		this.playerId = playerId;
		this.playerName = playerName;
		this.runs = runs;
	}
	public void setPlayerId(int playerId)
	{
		this.playerId = playerId;
	}
	public int getPlayerId()
	{
		return playerId;
	}
	public void setPlayerName(String playerName)
	{
		this.playerName = playerName;
	}
	public String getPlayerName()
	{
		return playerName;
	}
	public void setRuns(int runs)
	{
		this.runs = runs;
	}
	public int getRuns()
	{
		return runs;
	}
}
public class PlayerApplication 
{
	public static void main(String x[])
	{
		Player[] player = new Player[5];
		player[0] = new Player(1, "Virat", 85);
		player[1] = new Player(2, "Rohit", 120);
		player[2] = new Player(3, "KL", 45);
		player[3] = new Player(4, "Gill", 95 );
		player[4] = new Player(5, "Hardik", 60);
			
		Player max = player[0];
		
		for(int i = 0 ; i < player.length ; i++)
		{
			if(player[i].getRuns() > max.getRuns())
				max = player[i];
		}
		
		System.out.println("Highest Run Scorer : " + max.getPlayerName());
		System.out.println("Highest Runs : " + max.getRuns());
	}
}