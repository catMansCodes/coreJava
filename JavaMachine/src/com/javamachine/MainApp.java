package com.javamachine;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	       
		 System.out.println("Administrator Operations. Please select an Option from beolow list.");
		 
		 System.out.println("Add Employee : a");
		 System.out.println("Edit Employee : e");
		 System.out.println("Delete Employee : d");
		 
		char ch = sc.next().charAt(0);
	     
	      switch(ch) {
	         
	      // Add Employee : a
	      case 'a' :
	    	  addEmployee();
	         break;
	       
	      // Edit Employee : e   
	      case 'e' :
	    	  updateEmployee();
	         break;
	       
	      // Delete Employee : d   
	      case 'd' :
	    	  deleteEmployee();
	         break;
	         
	         default :
	         System.out.println("Invalid operation please try again");
	      }
	
		 sc.close();
	}
	
	
	public static void addEmployee() {
		
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Please add Employee Id: ");
		employee.employeeId = sc.nextInt();
		
		System.out.println("Please add Employee Name: ");
		employee.employeeName = sc.next();
		
		System.out.println("Please add Employee Address: ");
		employee.employeeAddress = sc.next();
		
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		
		employeeServiceImpl.addEmployee(employee);
		
		//if next id added show below message
		System.out.println("Congratulations, New Employee has been created successfully.");
		
		
		sc.close();
	}
	
	
	
	public static void updateEmployee() {
		
		Scanner sc = new Scanner(System.in);
		
		sc.close();
		System.out.println("Employee updated successfully.");
	}
	
	
	public static void deleteEmployee() {
		Scanner sc = new Scanner(System.in);
		
		sc.close();
		System.out.println("Employee removed successfully.");
	}

}
