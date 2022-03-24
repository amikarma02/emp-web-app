package com.sapient.aem.service;

import java.sql.SQLException;
import java.util.List;

import com.sapient.aem.exception.EmployeeException;
import com.sapient.aem.model.Employee;

public interface EmployeeService {
	
	public abstract Employee getEmployeeById(Integer empno) throws EmployeeException;
	public abstract List<Employee> getEmployees() throws EmployeeException;
	public abstract Integer addEmployee(Employee employee) throws EmployeeException;
	public abstract String updateEmployee(Employee employee) throws EmployeeException;
	public abstract String deleteEmployee(Integer empno) throws EmployeeException;


	
}
