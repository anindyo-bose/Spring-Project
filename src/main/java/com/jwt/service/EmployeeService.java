package com.jwt.service;

import java.util.List;

import com.jwt.model.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public void deleteEmployee(Integer employeeId);

	public Employee getEmployee(Integer employeeId);

	public Employee updateEmployee(Employee employee);
}
