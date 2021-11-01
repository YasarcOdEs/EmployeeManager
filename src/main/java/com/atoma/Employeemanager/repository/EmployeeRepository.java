package com.atoma.Employeemanager.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.atoma.Employeemanager.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Long> {

	Optional<Employee> findEmployeeById(Long id);

}
