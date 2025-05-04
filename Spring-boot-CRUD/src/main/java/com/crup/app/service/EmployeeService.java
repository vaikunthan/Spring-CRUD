package com.crup.app.service;

import java.util.List;

import com.crup.app.model.Employee;

public interface EmployeeService{
	Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getById(Long id);
    Employee update(Employee employee,Long id);
    void detete(Long id);
}
