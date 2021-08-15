package com.ltts;

import java.util.Scanner;

class Innings
{
	private String teamName;
	private String inningsName;
	private int runs;
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getInningsName() {
		return inningsName;
	}
	public void setInningsName(String inningsName) {
		this.inningsName = inningsName;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	
}

public class inningsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Innings team = new Innings();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the team name : ");
		String teamname = sc.nextLine();
		team.setTeamName(teamname);
		System.out.println("Enter Session : ");
		String inngname = sc.nextLine();
		team.setInningsName(inngname);
		System.out.println("Enter runs : ");
		int runs = sc.nextInt();
		team.setRuns(runs);
		
		System.out.println("Name : "+ team.getTeamName());
		System.out.println("Scored : "+team.getRuns());
		if(team.getInningsName().toLowerCase().equals("first"))
		{
			System.out.println("Need "+(team.getRuns()+1)+" to win");
		}
		else if(team.getInningsName().toLowerCase().equals("second"))
		{
			System.out.println("Match Ended");
		}
		else
		{
			System.out.println("Invalid Inning Name");
		}
		sc.close();
	}

}
