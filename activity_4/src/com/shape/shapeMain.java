package com.shape;

import java.util.Scanner;

public class shapeMain {
	public static void main(String[] args) {
	Shape sh;
	Scanner sc = new Scanner(System.in);
	System.out.println("Circle\nSquare");
	System.out.println("Enter the Shape");
	String shp = sc.nextLine();
	if(shp.toLowerCase().equals("circle"))
	{
		sh = new Circle();
		System.out.println("Enter the radius");
		int radius = sc.nextInt();
		sh.calculateArea(radius);
	}
	else if(shp.toLowerCase().equals("square"))
	{
		sh = new Square();
		System.out.println("Enter the side");
		int side = sc.nextInt();
		sh.calculateArea(side);
	}
	else
	{
		System.out.println("Invalid Shape, Try again");
	}
	sc.close();
	}
	
}
