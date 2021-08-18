package com.mom;

import java.util.*;

public class totalMoM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> players=new HashSet<String>();  
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String player;
		for(int i=0;i<count+1;i++)
		{
			player = sc.nextLine();
			players.add(player);
		}
		System.out.println(players.size());
	}
	List<String> list = new ArrayList<String>(players);	
    Collections.sort(list);
    
}
