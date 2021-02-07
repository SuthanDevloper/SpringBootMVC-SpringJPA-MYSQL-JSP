package com.suthan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suthan.model.Employee;
import com.suthan.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public EmployeeRepository employeeRepo;
	
	@Override
	public Integer saveEmployee(Employee e) {
		
		var sal = e.getSal();
		var hra = sal * 10/100.0;
		var ta = sal * 6/100.0;

	e.setHra(hra);
		e.setTa(ta);

		return  employeeRepo.save(e).getId();
	}

	@Override
	public void updateEmployee(Employee e) {
		var sal = e.getSal();
		var hra = sal * 10/100.0;
		var ta = sal * 6/100.0;

		e.setHra(hra);
		e.setTa(ta);
		 employeeRepo.save(e);
	}

	@Override
	public void deleteEmployee(Integer id) {
		employeeRepo.deleteById(id);

	}

	@Override
	public Optional<Employee> getOneEmployee(Integer id) {
		
		return employeeRepo.findById(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = employeeRepo.findAll();
		//JDK 1.8 List Sort (using Comparator)
		list.sort((ob1,ob2)->ob1.getName().compareTo(ob2.getName()));
		return list;
	}

	@Override
	public boolean isEmployeeExist(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepo.existsById(id);
	}

}
