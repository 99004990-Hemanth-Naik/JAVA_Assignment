package com.company;

import java.util.Scanner;

public class companyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company emp = new Company();
		Scanner sc = new Scanner(System.in);
		boolean present = false;
				
		System.out.println("Enter the company name : ");
		String Cname = sc.nextLine();
		emp.setName(Cname);
		System.out.println("Enter the employees : ");
		String empl = sc.nextLine();
		emp.setEmployees(empl);
		System.out.println("Enter TeamLead : ");
		String teamL = sc.nextLine();
		emp.setTeamlead(teamL);
		
		String[] emp_names = emp.getEmployees().split(",");
		for(String i:emp_names)
		{
			if(i.equals(teamL))
			{
				present = true;
				break;
			}
		}
		if(present == true) {
			System.out.println("Name : "+ emp.getName());
			System.out.println("Employees : "+emp.getEmployees());
			System.out.println("Lead : "+emp.getTeamlead());
		}
		else
			System.out.println("Invalid Input");
		sc.close();
	}

}
