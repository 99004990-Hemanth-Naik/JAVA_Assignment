package com.basic;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("This is for Loop with iteration number : "+(i+1));
		}
		while(i<10)
		{
			System.out.println("This is while loop after the end of for loop with iteration : "+(i+1));
			i++;
		}
	}

}
