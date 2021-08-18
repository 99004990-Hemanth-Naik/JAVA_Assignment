package com.handling;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class TeamNameNotFoundException extends Exception {
	public TeamNameNotFoundException(String str)
	{
		super(str);
	}
}

public class Team {
	static void validate(String[] teams,String team) throws TeamNameNotFoundException{
		if(!(Arrays.stream(teams).anyMatch(x->x.equals(team))))
		{
			throw new TeamNameNotFoundException("Entered team is not part of IPL season 13 ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] teams = {"RCB","CSK","SRH", "DC", "KXIP", "KKR", "MI", "RR"};
		System.out.println("Enter the expected winner team of IPL Season 13:");
		String winner = sc.nextLine();
		try {
			validate(teams,winner);
			System.out.println("Enter the expected runner Team of IPL Season 13:");
			String runner = sc.nextLine();
			try {
				validate(teams,runner);
				System.out.println("Expected IPL Season 13 winner : "+winner);
				System.out.println("Expected IPL Season 13 runner : "+runner);
			}
			catch (TeamNameNotFoundException e)
			{
				System.out.println(e);
			}
			
		}
		catch (TeamNameNotFoundException e)
		{
			System.out.println(e);
		}
		sc.close();
		
	}

}
