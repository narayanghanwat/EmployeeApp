package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tka.model.Employee;
import com.tka.service.EmployeeService;
import com.tka.service.UserService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	UserService userService;
	@GetMapping("/index")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/register-employee")
	public String registerEmployee() {
		return "registerEmployee.jsp";
	}
	@PostMapping("/save-employee")
	public String saveEmployee(@ModelAttribute Employee emp, Model model) {
		System.out.println(emp.getName());
		empService.saveEmployee(emp);
		model.addAttribute("msg", "Employee registered successfully!");
		return "/home.jsp";
	}
	
	@GetMapping("/get-all-employee-details") 
	public String getAllEmployee(Model model) { 
		List<Employee> empList = empService.getAllEmployee();
		model.addAttribute("empList", empList);
		return "viewEmployee.jsp";
	}
}
