package com.vehicle;

public class Vehicle {
		protected String make;
		protected String vehicleNumber;
		protected String fuelType;
		protected int fuelCapacity;
		protected int CC;
		
		public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int CC)
		{
			this.make = make;
			this.vehicleNumber = vehicleNumber;
			this.fuelType = fuelType;
			this.fuelCapacity = fuelCapacity;
			this.CC = CC;
		}
		public void displayMake()
		{
			System.out.println("****"+this.make+"****");
		}
		public void displayBasicInfo()
		{
			System.out.println("Vehicle number : "+this.vehicleNumber);
			System.out.println("Fuel Type : "+this.fuelType);
			System.out.println("Fuel Capacity : "+this.fuelCapacity);
			System.out.println("CC : "+this.CC);
		}
		public void displayDetailInfo()
		{

		}
}

class twoWheeler extends Vehicle
{
	private String kickStartAvailable;
	public twoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int CC, String kSA)
	{
		super(make, vehicleNumber, fuelType, fuelCapacity, CC);
		this.kickStartAvailable = kSA;
	}
	public void displayDetailInfo()
	{
		System.out.println("Kick Start Available : "+this.kickStartAvailable);
	}
}

class fourWheeler extends Vehicle
{
	private String audioSystem;
	private int numberOfDoors;
	public fourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int CC, String auSy, int nOD)
	{
		super(make, vehicleNumber, fuelType, fuelCapacity, CC);
		this.audioSystem = auSy;
		this.numberOfDoors = nOD;
	}
	public void displayDetailInfo()
	{
		System.out.println("Audio System : "+this.audioSystem);
		System.out.println("Number of Doors : "+this.numberOfDoors);
	}
}
