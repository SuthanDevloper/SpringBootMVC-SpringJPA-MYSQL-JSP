package com.suthan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suthan.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
