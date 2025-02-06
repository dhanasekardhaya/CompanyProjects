package org.day2;

import java.util.Scanner;

public class EmployeeDetails {
	
	private static void empId(int id) {
		try {
			System.out.println("Employee Id : "+id);	
		}catch(Exception e) {
			System.out.println("Invalid Input");
		}
		

	}
	
	private static void empName(String name) {
		System.out.println("Employee Name : " + name);

	}
	private static void empEmail(String email) {
		System.out.println("Employee Email : " + email);

	}
	
	private static void empSalary(float f) {
		System.out.println("Employrr Salary : " + f);

	}
	
	private static void empGender(char g) {
		System.out.println("Employee Gender : " + g);

	}
	private static void empCity(String city) {
		System.out.println("Employee city : " + city);

	}

	public static void main(String[] args) {
		EmployeeDetails empDetails = new EmployeeDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Details : Id, Name, Email, Salary, gender, city");
		int id = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		String email = sc.nextLine();
		float salary = sc.nextFloat();
		String gender = sc.next();
		char genders = gender.charAt(0);
		sc.nextLine();
		String city = sc.nextLine();
		empId(id);
		empName(name);
		empEmail(email);
		empSalary(salary);
		empGender(genders);
		empCity(city);
		

	}

}
