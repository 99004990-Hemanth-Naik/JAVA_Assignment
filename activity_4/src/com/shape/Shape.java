package com.shape;

abstract class Shape {
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	abstract void calculateArea(int value);
}

class Circle extends Shape
{
	void calculateArea(int value)
	{
		this.value = (int) (3.142*value*value);
		System.out.println("The area of Circle is : "+this.value);
	}
}

class Square extends Shape
{
	void calculateArea(int value)
	{
		this.value = value*value;
		System.out.println("The area of Square is : "+this.value);
	}
}
