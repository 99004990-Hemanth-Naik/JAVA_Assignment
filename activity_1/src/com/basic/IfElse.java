package com.basic;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer ");
		int num = sc.nextInt();
		if(num>=0)
		{
			if(num==0)
			{
				System.out.println("Zero");
			}
			else
			{
				System.out.println("Positive number");
			}
		}
		else
		{
			System.out.println("Negative");
		}
		sc.close();

	}

}
