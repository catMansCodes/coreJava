package com.javamachine;

import java.util.List;

public interface EmployeeService {
	
	// get All Employee for Dashboard
	public List<Employee> getAllEmployee();
	
	// Add new Employee
	public int addEmployee(Employee employee);
	
	//Edit employee
	public void updateEmployee(int employeeId);
	
	//Delete Employee
	public void deleteEmployee(int employeeId);
	
}
