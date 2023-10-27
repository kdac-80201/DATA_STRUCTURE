package com.tester;

import java.util.Arrays;

import com.employee.Employee;

public class Program {
	
	public static void SortBySalary(Employee[] e, int length){
		
		for(int i = 1; i < length-1; i++) {
			for(int j = 0; j < length; j++) {
				if(e[j].getSalary() > e[i].getSalary()) {
					double temp = e[j].getSalary();
					e[j].setSalary(e[i].getSalary());
					e[i].setSalary(temp);
					
				}
			}
		}
		System.out.println(Arrays.toString(e));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] e = new Employee[5];
		e[0] = new Employee(1,"afnan",25000);
		e[1] = new Employee(3,"binod",15000);
		e[3] = new Employee(8,"none",14000);
		e[4] = new Employee(6,"good",4700);
		e[2] = new Employee(4,"nobody",15000);
		
		SortBySalary(e,e.length);

	}

}
