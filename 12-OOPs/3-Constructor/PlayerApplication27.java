/*Question 27: Write a Java program to find total matches played by team players.
Description: Create Player class with name and matches. Calculate total matches.
INPUT: Virat 200 Rohit 180 Rahul 90
OUTPUT: Total Matches: 470
EXPLANATION: Create Player class with fields name and matches. Use constructor to initialize. Store 3 players in array. Loop through array and sum all matches: 200+180+90 = 470. Display total matches played by all team players.*/

class Player
{
	private int matches;
	private String name;
	
	Player(String name,int matches)
	{
		this.name = name;
		this.matches = matches;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setMatches(int matches)
	{
		this.matches = matches;
	}
	public int getMatches()
	{
		return matches;
	}
}
public class PlayerApplication27
{
	public static void main(String x[])
	{
		Player[] n = new Player[3];

		n[0] = new Player("Virat", 200);
		n[1] = new Player("Rohit", 180);
		n[2] = new Player("Rahul", 90);
		
		int sum = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			sum += n[i].getMatches();
		}
		System.out.println("Total Matches : " + sum);
	}
}
