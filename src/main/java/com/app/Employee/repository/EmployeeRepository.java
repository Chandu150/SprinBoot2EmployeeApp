package com.app.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Employee.model.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}
