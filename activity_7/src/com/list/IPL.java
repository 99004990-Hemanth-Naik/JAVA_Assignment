package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IPL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> teams = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			String team = sc.nextLine();
			teams.add(i,team);
		}
		System.out.println("Enter swap positions");
		int pos1 = sc.nextInt();
		int pos2 = sc.nextInt();
		Collections.swap(teams, pos1, pos2);
		for(String team:teams)
		{
			System.out.println(team);
		}
		sc.close();
	}

}
