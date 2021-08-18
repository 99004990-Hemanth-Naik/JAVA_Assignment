package com.match;

import java.util.Scanner;

public class matchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Match mat;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the match Format");
		System.out.println("1. ODI\n2. T20\n3. Test");
		int format = sc.nextInt();
		if(format == 1)
		{
			System.out.println("Enter the current Score");
			int currSc = sc.nextInt();
			System.out.println("Enter the current Over");
			float currOver = sc.nextFloat();
			System.out.println("Enter the Target Score");
			int tarScore = sc.nextInt();
			mat = new ODIMatch();
			mat.setCurrentScore(currSc);
			mat.setCurrentOver(currOver);
			mat.setTarget(tarScore);
			double RR = mat.calculateRunRate();
			int balls = mat.calculateBalls();
			mat.display(RR, balls);
		}
		else if(format == 2)
		{
			System.out.println("Enter the current Score");
			int currSc = sc.nextInt();
			System.out.println("Enter the current Over");
			float currOver = sc.nextFloat();
			System.out.println("Enter the Target Score");
			int tarScore = sc.nextInt();
			mat = new T20Match();
			mat.setCurrentScore(currSc);
			mat.setCurrentOver(currOver);
			mat.setTarget(tarScore);
			mat.display(mat.calculateRunRate(), mat.calculateBalls());
		}
		else if(format == 3)
		{
			System.out.println("Enter the current Score");
			int currSc = sc.nextInt();
			System.out.println("Enter the current Over");
			float currOver = sc.nextFloat();
			System.out.println("Enter the Target Score");
			int tarScore = sc.nextInt();
			mat = new TestMatch();
			mat.setCurrentScore(currSc);
			mat.setCurrentOver(currOver);
			mat.setTarget(tarScore);
			mat.display(mat.calculateRunRate(), mat.calculateBalls());
		}
		else 
		{
			System.out.println("Invalid choice of Format, Try again");
		}
		sc.close();
	}

}
