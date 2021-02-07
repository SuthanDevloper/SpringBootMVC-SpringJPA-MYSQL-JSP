package com.suthan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.suthan.model.Employee;


public interface EmployeeService {
	
Integer saveEmployee(Employee e);
	
	
	void updateEmployee(Employee e);
	
	
	void deleteEmployee(Integer id);
	
	
	
	Optional<Employee> getOneEmployee(Integer id);
	
	
	List<Employee> getAllEmployees();
	
	
	boolean isEmployeeExist(Integer id);

}
