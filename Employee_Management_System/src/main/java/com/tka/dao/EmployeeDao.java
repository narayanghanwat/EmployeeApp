package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.model.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	SessionFactory sf;
	public void saveEmployee(Employee emp) {
		Session ssn = sf.openSession();
		ssn.save(emp);
		ssn.beginTransaction().commit();
		System.err.println("Registered Successfully");
	}
	public List<Employee> getAllEmployee() {
		Session ssn = sf.openSession();
		return ssn.createQuery("from Employee", Employee.class).list();
	}

}
