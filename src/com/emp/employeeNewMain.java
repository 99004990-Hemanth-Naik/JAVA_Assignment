package com.emp;

import java.util.Scanner;

public class employeeNewMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee_new empl = new employee_new();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		System.out.println("Enter the name : ");
		String name = sc.nextLine();
		empl.setName(name);
		System.out.println("Enter Address : ");
		String address = sc.nextLine();
		empl.setAddress(address);
		System.out.println("Enter Mobile : ");
		String mobile = sc.nextLine();
		empl.setMobile(mobile);
		
		System.out.println("Employee Details");
		System.out.println("Name : "+empl.getName());
		System.out.println("Address : "+empl.getAddress());
		System.out.println("Mobile : "+empl.getMobile());
		while(flag)
		{
			System.out.println("Menu");
			System.out.println("1. Update Employee name");
			System.out.println("2. Update Employee Address");
			System.out.println("3. Update Employee mobile");
			System.out.println("4. All information correct/Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:	{
							empl.updateName();
							break;
						}
				case 2: {
							empl.updateAddress();
							break;
						}
				case 3: {
							empl.updateMobile();
							break;
						}
				case 4: {
							flag = false;
							break;
						}
				default:{
							System.out.println("Invalid choice Try again");
							break;
						}
			}
		}
			System.out.println("The details are:");
			System.out.println("Name : "+empl.getName());
			System.out.println("Address : "+empl.getAddress());
			System.out.println("Mobile : "+empl.getMobile());
			sc.close();
	}

}
