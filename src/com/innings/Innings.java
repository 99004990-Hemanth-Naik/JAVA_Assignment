package com.innings;

public class Innings {
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
	
	public void displayInningsDetails()
	{
		System.out.println("Name : "+ getTeamName());
		System.out.println("Scored : "+getRuns());
		if(getInningsName().toLowerCase().equals("first"))
		{
			System.out.println("Need "+(getRuns()+1)+" to win");
		}
		else if(getInningsName().toLowerCase().equals("second"))
		{
			System.out.println("Match Ended");
		}
		else
		{
			System.out.println("Invalid Inning Name");
		}
	}
}
