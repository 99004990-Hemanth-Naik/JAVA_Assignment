package com.customer;

import java.util.Scanner;

public class customerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer det = new Customer();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the details : ");
		String details = sc.nextLine();
		String[] detailsArr = details.split(",", 3);
		det.setName(detailsArr[0]);
		det.setAddress(detailsArr[1]);
		det.setMobile(detailsArr[2]);
		
		System.out.println("Name : "+ det.getName());
		System.out.println("Address : "+ det.getAddress());
		System.out.println("Mobile : "+det.getMobile());
		sc.close();
	}

}
