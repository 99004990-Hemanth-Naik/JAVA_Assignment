package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TopScorers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> IPL13 = new ArrayList<String>();
		List<String> IPL12 = new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 13");
		String player;
		for(int i=0;i<5;i++)
		{
			player = sc.nextLine();
			IPL13.add(i, player);
		}
		System.out.println("Enter the top 5 scorers of IPL Season 12");
		for(int i=0;i<5;i++)
		{
			player = sc.nextLine();
			IPL12.add(i, player);
		}
		IPL13.retainAll(IPL12);
		System.out.println("Consistent players are:");
		for(String p:IPL13)
		{
			System.out.println(p);
		}
		sc.close();
	}

}
