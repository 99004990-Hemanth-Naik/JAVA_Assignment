package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> scores = new ArrayList<Integer>();
		int matches = sc.nextInt();
		int score,fifties=0,hundreds=0;
		for(int i=0;i<matches;i++)
		{
			score = sc.nextInt();
			scores.add(i, score);
			if(score>=50 && score<100)
			{
				fifties++;
			}
			else if(score>=100)
			{
				hundreds++;
			}
		}
		System.out.println(fifties+"\n"+hundreds);
		sc.close();
	}
}
