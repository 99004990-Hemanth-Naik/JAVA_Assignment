import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;

import java.util.Scanner;



class Bowler{
	private String name;

	public Bowler()

	{

	}

	public void setName(String name)

	{
		this.name=name;
	}

	public String getName()
	{
		return this.name;
	}
}



class Wicket
{
	String playerName;
	Bowler bowler;
	
	public Wicket()
	{
		
	}
	public Wicket(String description,Bowler bowler)
	{
		
	}
	public void setPlayerName(String playerName)
	{
		this.playerName=playerName;
	}

	public Bowler getBowler() {
		return bowler;
	}

	public void setBowler(Bowler bowler) {
		this.bowler = bowler;
	}

	public String getPlayerName() {
		return playerName;
	}
 
	
}
public class Test {
	
	public static void main(String[] args)
	{
		 
		
		HashMap<String,String> map=new HashMap();
		Scanner in=new Scanner(System.in);
		String cond;
		do
		{
			System.out.println("Enter the player name");
			String name=in.next();
			System.out.println("Enter wickets - seperated by '|' symbol.");
			String wicket=in.next();
			map.put(name,wicket);
			System.out.println("Do you want to add another player (yes/no)");
			cond=in.next();
		}while(cond=="yes");
		
		do
		{
			System.out.println("Enter the player name to search");
			String search=in.next();
			if(!map.containsKey(search))
				System.out.println("No player found with the name "+search);
			else
			{
				System.out.println("Player Name :"+search);
				System.out.println("Wickets :");
				String[] players=map.get(search).split("\\|");
				for(String player:players)
				{
					System.out.println(player);
				}
			}
			System.out.println("Do you want to search another player (yes/no)");
			cond=in.next();
		}while(cond=="yes");
	}
}