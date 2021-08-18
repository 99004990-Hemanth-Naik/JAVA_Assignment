package com.handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunRate {
	public static void main(String[] args) throws IOException{
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(r);
		try
		{
			System.out.println("Enter the total runs scored");
			int runs = Integer.parseInt(reader.readLine());
			System.out.println("Enter the total overs faced");
			int overs = Integer.parseInt(reader.readLine());
			try
			{
				float runRate = runs/overs;
				System.out.println("Current Run Rate :"+runRate);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
