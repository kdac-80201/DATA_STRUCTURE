package com.searchemployee;

public class SearchUserDefined {
	public static int SearchById(Employee[] e,int id,int length) {
		
//		System.out.println(e[1].getEmpid());
		for(int i = 0; i < length ; i++) {
			if(e[i].getEmpid() ==  id)
				return i;
		}
		return -1;
	}
	public static int SearchBySalary(Employee[] e, double salary, int length) {
		
		for(int i = 0; i < length ; i++) {
			if(e[i].getSalary() == salary)
				return i;
		}
		return -1;
		
	}
	
	public static int SearchByName(Employee[] e,String name, int length) {
		
		for(int i = 0; i < length ; i++) {
			if(e[i].getName().equals(name))
				return i;
		}
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		
		Employee[] e = new Employee[3];
		e[0] = new Employee(1,"binod",2500);
		e[1] = new Employee(2,"akash",50000);
		e[2] = new Employee(8,"none",9500);
		
		
		int id = 8;
		int length = e.length;
		int count = SearchById(e,id,length);
		
		if(count == -1) {			
			System.out.println("Id not found");
		}
		else
			System.out.println("value found by id is "+e[count]);
		
		//*******************************************************
		// searching by salary 
		
		
//		Employee[] e2 = new Employee[3];
//		e2[0] = new Employee(1,"binod",2500);
//		e2[1] = new Employee(2,"akash",50000);
//		e2[2] = new Employee(8,"none",9500);
//		
//		double salary = 2500;
//		int length2 = e2.length;
//		int cnt = SearchBySalary(e2,salary,length2);
//		
//		if(cnt == -1) {
//			System.out.println("We couldn't find employee with salary"+salary);
//		}
//		else {
//			System.out.println("Same Salaried "+e2[cnt]);
//		}
		
		 
		
		//********************************************************
		
		Employee[] e3 = new Employee[3];
		e3[0] = new Employee(1,"binod",2500);
		e3[1] = new Employee(2,"akash",50000);
		e3[2] = new Employee(8,"none",9500);
		
		
		String name = "none";
		int length3 = e3.length;
		int c = SearchByName(e3,name,length3);
		if(c == -1) {
			System.out.println("We coudn't find any employee with that name ");
		}
		else
			System.out.println(e3[c]);
		
	}
}
