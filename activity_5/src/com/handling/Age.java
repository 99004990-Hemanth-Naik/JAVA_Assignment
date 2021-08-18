package com.handling;

import java.util.Scanner;


class invalidAgeException extends Exception {
	public invalidAgeException(String str)
	{
		super(str);
	}
}

public class Age{
	static void validate(int age) throws invalidAgeException{
		if(age<19)
		{
			throw new invalidAgeException("Not Eligible to play IPL");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Player Name :");
		String name = sc.nextLine();
		System.out.println("Enter the player age :");
		int age = sc.nextInt();
		try
		{
			validate(age);
			System.out.println("Player name : "+name);
			System.out.println("Player age : "+age);
			sc.close();
		}
		catch(invalidAgeException e)
		{
			System.out.println(e);
		}
	}
}