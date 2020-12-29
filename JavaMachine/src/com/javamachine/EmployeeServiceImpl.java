package com.javamachine;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

	List<Employee> employeeList = new ArrayList<Employee>();
	
	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeList;
	}

	@Override
	public int addEmployee(Employee employee) {
		
		employeeList.add(employee);
		
		return employee.employeeId;
	}

	@Override
	public void updateEmployee(int employeeId) {
		
		//update object from employeeList using employeeId
		
	}

	@Override
	public void deleteEmployee(int employeeId) {
		
		//remove object from employeeList using employeeId
	}
	
	
}
