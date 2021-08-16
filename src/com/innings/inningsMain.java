package com.innings;

import java.util.Scanner;


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
		team.displayInningsDetails();
		sc.close();
	}

}
