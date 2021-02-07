package com.suthan.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	/*
	@GetMapping("/inputs")
	public String readInputs(@RequestParam( value="eid",required = false) Integer e,Model model )		{
		//System.out.println("data is"+en);
	model.addAttribute("e",e);
		return "Data";
		
	}
		// Make Default
//	@GetMapping("/inputs")
//	public String readInputs(@RequestParam (value ="ename",required =false,defaultValue="Hello")String ename, Model model)
//	
//	{
//		System.out.println("data is"+ename);
//		model.addAttribute("en",ename);
//		return "Data";
//		
//	}*/
	
	//Passing mutilple key and values
	@GetMapping("/inputs")
	public String readInputs(@RequestParam (value ="eid")Integer eid, 
			@RequestParam (value ="ename")String ename,
			@RequestParam (value ="esal") Long esal,
			
			
			
			
			Model model)
	
	{
		System.out.println("data is"+ename);
		
		model.addAttribute("eid",eid);
		model.addAttribute("ename",ename);
		model.addAttribute("esal",esal);
		return "Data";
		
	}


}
