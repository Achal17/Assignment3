	package com.java.assignment3;

import java.util.HashMap;

public class Employee_info {
	private String name;
	private String designation;
	private String dept;
	public Employee_info(String name, String designation, String dept) {
		super();
		this.name = name;
		this.designation = designation;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public String getDept() {
		return dept;
	}
	@Override
	public String toString() {
		return "Employee name: "+name + " , Designation: " + designation + " , Department: " +dept;
	}
	

	public static void main(String[] args) {
		HashMap<Employee_info,Employee_info> dataset = new HashMap<>();
		dataset.put(new Employee_info("Amy Lopez", "Sr. Product Manager","Global Services"),new Employee_info("Amy Lopez", "Sr. Product Manager","Global Services"));
		dataset.put(new Employee_info("Alan Webb", "Product Owner","Data Consulting"),new Employee_info("Amy Lopez", "Sr. Product Manager","Global Services"));
		dataset.put(new Employee_info("Jeff Mosher", "Sr. Manager","Engineering"),new Employee_info("Amy Lopez", "Sr. Product Manager","Global Services"));
		dataset.put(new Employee_info("Scott Leiva", "Director","Data Consulting"),new Employee_info("Alan Webb", "Product Owner","Data Consulting"));
		dataset.put(new Employee_info("Joe Caslin", "Program Manager","Data Consulting"),new Employee_info("Alan Webb", "Product Owner","Data Consulting"));
		dataset.put(new Employee_info("Matt Cogle", "Sr. Director","Core Services"),new Employee_info("Jeff Mosher", "Sr. Manager","Engineering"));
		dataset.put(new Employee_info("Alexander Nabokih", "Operation Manager","Engineering"),new Employee_info("Jeff Mosher", "Sr. Manager","Engineering"));
		dataset.put(new Employee_info("Alan Dorsey", "Solution Architect","Data Consulting"),new Employee_info("Scott Leiva", "Director","Data Consulting"));
		dataset.put(new Employee_info("Aron Klco", "Technical Architect","Data Consulting"),new Employee_info("Scott Leiva", "Director","Data Consulting"));
		dataset.put(new Employee_info("Swara Musku", "Developer","Data Consulting"),new Employee_info("Joe Caslin", "Program Manager","Data Consulting"));
		dataset.put(new Employee_info("Laura Wei", "Program Analyst","Knowledge Services"),new Employee_info("Alexander Nabokih","Operation Manager","Engineering"));
		dataset.put(new Employee_info("Tom Durnell", "Developer","Core Services"),new Employee_info("Alexander Nabokih","Operation Manager","Engineering"));
		dataset.put(new Employee_info("Philip Lp", "product Tester","Core Services"),new Employee_info("Alexander Nabokih","Operation Manager","Engineering"));
		
		Employee obj = new Employee();
		obj.findEmployee(dataset);
		System.out.println("----------------------------------------------");
		obj.findManager(dataset);
	}
}
