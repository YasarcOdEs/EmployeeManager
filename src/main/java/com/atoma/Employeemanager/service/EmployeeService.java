package com.atoma.Employeemanager.service;

import java.util.List;

import com.atoma.Employeemanager.model.Employee;


public interface EmployeeService {
 
     public Employee addEmployee(Employee employee);
	 
	 public List<Employee> listAllEmployees();
	 
	 public Employee updateEmployee(Employee employee);
	 
	 public Employee findEmployeeById(Long id);
	 
	 public void deleteEmployee(Long id);
}
