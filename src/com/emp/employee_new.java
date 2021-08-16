package com.emp;

import java.util.Scanner;

public class employee_new {
	private String name;
	private String address;
	private String mobile;
	Scanner sc = new Scanner(System.in);
	
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
	public void updateName()
	{
		System.out.println("Current name is : "+getName());
		System.out.println("Enter the name : ");
		String up_name = sc.nextLine();
		this.name = up_name;
	}
	public void updateAddress()
	{
		System.out.println("Current address is : "+getAddress());
		System.out.println("Enter the address : ");
		String up_addr = sc.nextLine();
		this.address = up_addr;
	}
	public void updateMobile()
	{
		System.out.println("Current Mobile number is : "+getMobile());
		System.out.println("Enter the Mobile number : ");
		String up_mobile = sc.nextLine();
		this.mobile = up_mobile;
	}
}
