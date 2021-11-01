package com.atoma.Employeemanager.serviceImpl;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atoma.Employeemanager.model.Employee;
import com.atoma.Employeemanager.repository.EmployeeRepository;
import com.atoma.Employeemanager.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
  
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> listAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
			
		return employeeRepository.save(employee);
	}

	@Override
	public Employee findEmployeeById(Long id) {
		Employee exsistingEmployee = employeeRepository.findEmployeeById(id).orElse(null);
		if(exsistingEmployee==null) {
			throw new RuntimeException("Employee not found with ID: "+id);
		}
		return exsistingEmployee;
	}
	
	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}

	

}
