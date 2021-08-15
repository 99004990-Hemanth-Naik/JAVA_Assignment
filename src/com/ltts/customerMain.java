package com.ltts;

import java.util.Scanner;

class Customer
{
	private String name;
	private String address;
	private String mobile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}

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
