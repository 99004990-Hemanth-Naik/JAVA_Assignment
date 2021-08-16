package com.employee;

import java.util.Scanner;

public class employeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name : ");
		String name = sc.nextLine();
		emp.setName(name);
		System.out.println("Enter Address : ");
		String Address = sc.nextLine();
		emp.setAddress(Address);
		System.out.println("Enter Mobile : ");
		String Mob = sc.nextLine();
		emp.setMobile(Mob);
		
		System.out.println("Employee Details");
		System.out.println("Name : "+emp.getName()); 
		System.out.println("Address : "+emp.getAddress()); 
		System.out.println("Mobile : "+emp.getMobile()); 
		sc.close();
	}

}
