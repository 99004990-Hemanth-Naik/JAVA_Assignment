package com.list;

import java.util.*;

public class Cricket {
	public static void main(String[] args) {
		List<String> details = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player details");
		System.out.println("Enter Player name : ");
		String name = sc.nextLine();
		details.add(0,name);
		System.out.println("Enter age : ");
		String age = sc.nextLine();
		details.add(1,age);
		System.out.println("Enter Country : ");
		String country = sc.nextLine();
		details.add(2,country);
		System.out.println("Player details");
		for(String det:details)
			System.out.println(det);
		System.out.println("Enter Skill");
		String skill = sc.nextLine();
		System.out.println("Enter the position to add the skill");
		int pos = sc.nextInt();
		details.add(pos, skill);
		System.out.println("Player Details");
		for(String det:details)
			System.out.println(det);
		System.out.println("Enter the position of the detail to be removed");
		int remPos = sc.nextInt();
		details.remove(remPos);
		for(String det:details)
			System.out.println(det);
		sc.close();
	}
}
