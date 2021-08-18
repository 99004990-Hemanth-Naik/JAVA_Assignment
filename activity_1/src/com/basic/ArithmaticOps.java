package com.basic;

import java.util.Scanner;

public class ArithmaticOps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Sum :"+(num1+num2));
		System.out.println("Difference :"+(num1-num2));
		System.out.println("Product :"+(num1*num2));
		System.out.println("Quotient :"+(num1/num2));
		System.out.println("Remainder :"+(num1%num2));
		sc.close();
	}
}
