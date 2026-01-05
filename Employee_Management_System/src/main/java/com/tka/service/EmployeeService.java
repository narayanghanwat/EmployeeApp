package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.EmployeeDao;
import com.tka.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao ed;
	public void saveEmployee(Employee emp) {
		System.out.println(emp);
		ed.saveEmployee(emp);
	}
	public List<Employee> getAllEmployee() {
		return ed.getAllEmployee();
	}

}
