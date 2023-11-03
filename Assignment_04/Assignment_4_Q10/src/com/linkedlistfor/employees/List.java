package com.linkedlistfor.employees;

import com.employeepackage.Employee;

public class List {
	public class Node {

		public Employee data;
		public Node next;

		public Node(Employee value) {
			data = value;
			next = null;
		}
	}

	private Node head;

	public List() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addEmployee(Employee e) {
		Node newnode = new Node(e);
		if (isEmpty())
			head = newnode;
		else
			newnode.next = head;
		head = newnode;
	}

	public void displayEmployee() {
		Node trav = head;
		if(trav == null) {
			System.out.println("Empty... ");
		}
		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
	}

	public void searchEmployee(Employee e) {
		Node trav = head;

		while (trav != null) {
			if (trav.data.getEmpid() == e.getEmpid())
				System.out.println(trav.data);
			trav = trav.next;
		}

	}

	public void deleteEmployee(Employee e) {
		Node trav = head;
		do {
			if (trav.data.getEmpid() == e.getEmpid() && trav.next == null) {
				head = null;
				break;
			}
			else if (trav.next.data.getEmpid() == e.getEmpid() && trav.next.next == null) {
				trav.next = null;
	
			} else if (trav.next.data.getEmpid() == e.getEmpid() && trav.next != null) {
				Node temp = trav.next.next;
				trav.next = temp;

			} else if (trav.data.getEmpid() == e.getEmpid() && trav.next != null)
				head = trav.next;

			trav = trav.next;
		} while (trav.next != null);
		
		System.out.println("Employee Deleted! ");

	}

	public void updateEmployee(Employee e) {
		Node trav = head;
		do {

			if (trav.data.getEmpid() == e.getEmpid()) {
				trav.data.setSalary(e.getSalary());
			}
			trav = trav.next;

		} while (trav != null);
		System.out.println("Salary Updated! ");

	}
}
