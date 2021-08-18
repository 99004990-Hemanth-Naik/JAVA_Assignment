package com.handling;

import java.util.Scanner;
import java.io.*;

public class Array {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of overs");
		int overs = sc.nextInt();
		int overArr[] = new int[overs];
		int i;
		System.out.println("Enter the number of runs for each over ");
		for(i=0;i<overs;i++)
		{
			overArr[i]=sc.nextInt();
		}
		System.out.println("Enter the over number");
		int overNum = sc.nextInt();
		try
		{
			System.out.println("Runs scored in this over : "+overArr[overNum-1]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		sc.close();
	}

}
