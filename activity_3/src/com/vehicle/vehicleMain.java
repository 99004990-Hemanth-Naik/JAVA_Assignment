package com.vehicle;

import java.util.Scanner;

public class vehicleMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Four Wheeler");
		System.out.println("2. Two Wheeler");
		System.out.println("Enter Vehicle Type");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				System.out.println("Vehicle Make: ");
				String make = sc.nextLine();
				sc.nextLine();
				System.out.println("Vehicle Number : ");
				String vNo = sc.nextLine();
				System.out.println("Fuel Type :");
				System.out.println("1. Petrol");
				System.out.println("2. Diesel");
				int fType = sc.nextInt();
				String fTypeVal = "";
				switch(fType)
				{
					case 1:
					{
						fTypeVal = "Petrol";
					}
					case 2:
					{
						fTypeVal = "Diesel";
					}
				}
				System.out.println("Fuel Capacity :");
				int fCap = sc.nextInt();
				System.out.println("Engine CC :");
				int CC = sc.nextInt();
				System.out.println("Audio System :");
				String aSystem = sc.nextLine();
				sc.nextLine();
				System.out.println("Number of Doors :");
				int nDoors = sc.nextInt();
				fourWheeler fWheeler = new fourWheeler(make, vNo, fTypeVal, fCap, CC, aSystem, nDoors);
				fWheeler.displayMake();
				System.out.println("----Basic Information----");
				fWheeler.displayBasicInfo();
				System.out.println("----Detailed Information----");
				fWheeler.displayDetailInfo();
			}
			case 2: 
			{
				System.out.println("Vehicle Make: ");
				String make = sc.nextLine();
				sc.nextLine();
				System.out.println("Vehicle Number : ");
				String vNo = sc.nextLine();
				System.out.println("Fuel Type :");
				System.out.println("1. Petrol");
				System.out.println("2. Diesel");
				int fType = sc.nextInt();
				String fTypeVal = "";
				switch(fType)
				{
					case 1:
					{
						fTypeVal = "Petrol";
					}
					case 2:
					{
						fTypeVal = "Diesel";
					}
				}
				System.out.println("Fuel Capacity :");
				int fCap = sc.nextInt();
				System.out.println("Engine CC :");
				int CC = sc.nextInt();
				System.out.println("Kick Start Available(Yes/No) :");
				String kStart = sc.nextLine();
				sc.nextLine();
				twoWheeler tWheeler = new twoWheeler(make, vNo, fTypeVal, fCap, CC, kStart);
				tWheeler.displayMake();
				System.out.println("----Basic Information----");
				tWheeler.displayBasicInfo();
				System.out.println("----Detailed Information----");
				tWheeler.displayDetailInfo();
			}
		}
		sc.close();
	}

}
