package org.day1;

public class Employee {

	/*
	 * Description: Create an object for employee class and call above methods also
	 * follow the all coding standards.
	 * Local variable and methods are stored in stack memory
	 * new keywords values stored in Heap Memory
	 */
	private void empId() {
		System.out.println("This is Employee Id method");

	}

	private void empName() {
		System.out.println("This is Employee Name Method");

	}

	private void empDob() {
		System.out.println("This is Employee DOB Method");

	}

	private void empPhone() {
		System.out.println("This is Employee Phone Method");

	}

	private void empEmail() {
		System.out.println("This is Employee Email Method");

	}

	private void empAddress() {
		System.out.println("This is Employee Address Method");

	}

	public static void main(String[] args) {
		// 		Stack		Heap
		Employee emp = new Employee();
		emp.empId();
		emp.empName();
		emp.empDob();
		emp.empEmail();
		emp.empPhone();
		emp.empAddress();

	}

}
