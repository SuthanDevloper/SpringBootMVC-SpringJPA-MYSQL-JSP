package com.suthan.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.suthan.model.Employee;
import com.suthan.service.EmployeeServiceImpl;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	public EmployeeServiceImpl employeeImpl;
	
	@GetMapping("/register")
	public String show() {
		return "EmpReg";
		
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute Employee employee, Model model )
	{
		Integer id =employeeImpl.saveEmployee(employee);
		String message="Employee '"+id+"' saved";
		
		model.addAttribute("message", message);
		return "EmpReg";
		
		
	}
	
	@GetMapping("/empDetails")
	public String getAllEmployee(Model model) {
		
		 List<Employee> list =employeeImpl.getAllEmployees();
		 model.addAttribute("list", list);
		return "EmpDetails";
		//return null;
	}
	
	@GetMapping("/delete")
	public String deleteEmployeeById(@RequestParam Integer id) {
		if(employeeImpl.isEmployeeExist(id)) {
			employeeImpl.deleteEmployee(id);
		}
			return "redirect:empDetails";
	}
	
	@GetMapping("/edit")
	public String showEmployeeEdit(
				@RequestParam Integer id,
				Model model
			) 
	{
		String page = null;
		// JDK 1.8 - Optional - Handle null value
		//make service call to get data
		Optional<Employee> opt = employeeImpl.getOneEmployee(id);
		if(opt.isPresent()) { 
			Employee  emp = opt.get();
			
			//send to UI as Form object
			model.addAttribute("employee", emp);
			
			page = "EmployeeEdit";
		} else {
			//given id not exist in db
			page = "redirect:all";
		}
		return page;
	}
	
	
	
	
	@PostMapping("/update")
	public String updateEmployee(@ModelAttribute Employee employee, Model model )
	{
		employeeImpl.updateEmployee(employee);
		return "redirect:empDetails";
		
		
	}
	
	
	
	
	
	}


