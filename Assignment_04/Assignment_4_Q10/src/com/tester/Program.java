package com.tester;

import java.util.Scanner;

import com.employeepackage.Employee;
import com.linkedlistfor.employees.List;

public class Program {
	static Scanner sc = new Scanner(System.in);

	static int menu() {
		int choice;
		System.out.println("********************");
		System.out.println("0. EXIT");
		System.out.println("1. Add Employee");
		System.out.println("2. Display Employees");
		System.out.println("3. Search Employee");
		System.out.println("4. Delete Employee");
		System.out.println("5. Update Salary");
		System.out.println("Enter your choice ");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		Employee emp;
		List l1 = new List();
		int counter = 0;

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				emp = new Employee();
				emp.accept();
				l1.addEmployee(emp);
				counter ++;
				break;
			case 2:
				l1.displayEmployee();
				break;
			case 3:
				System.out.print("Enter Employee ID ");
				emp = new Employee();
				int id = sc.nextInt();
				emp.setEmpid(id);
				l1.searchEmployee(emp);
				break;
			case 4:
				if(counter == 0) {
					System.out.println("Mass Layoffs! No employee left");					
					break;
				}
				emp = new Employee();
				System.out.print("Enter Employee ID ");
				int id1 = sc.nextInt();
				emp.setEmpid(id1);
				l1.deleteEmployee(emp);
				counter--;
				break;
			case 5:
				emp = new Employee();
				System.out.print("Enter Employee ID ");
				int id2 = sc.nextInt();
				System.out.println("Enter Salary ");
				double sal = sc.nextDouble();
				emp.setSalary(sal);
				emp.setEmpid(id2);
				l1.updateEmployee(emp);
				break;
			default:
				System.out.println("Invalid Entry ");
				break;
			}
		}

	}

}
