package com.app.Employee.service;  

import java.util.List;

import com.app.Employee.model.Employee;

public interface IEmployeeService {
	
	Integer saveEmployee(Employee e);
	
	List<Employee> getAllEmployees();
	
	 Employee getOneEmployee(Integer id);
	 
	void deleteEmployee(Integer id);
	
	void updateEmployee(Employee e);
}
