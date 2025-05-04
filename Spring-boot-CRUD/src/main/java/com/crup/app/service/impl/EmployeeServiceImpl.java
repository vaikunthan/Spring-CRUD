package com.crup.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.crup.app.model.Employee;
import com.crup.app.repository.EmployeeRepository;
import com.crup.app.service.EmployeeService;
import com.crup.app.exception.ResourceNotFoundException;
@Service
public class EmployeeServiceImpl implements EmployeeService	 {

	
	private EmployeeRepository employeeRepository;
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll() 	;
	}
	
	@Override
	public Employee getById(Long id) {
		// TODO Auto-generated method stub
		Optional<Employee> employee= employeeRepository.findById(id);
		
		if(employee.isPresent()) {
			return employee.get();
		}
		else {
			throw new ResourceNotFoundException("id", "id", "id");
		}
	}
	@Override
	public Employee update(Employee employee, Long id) {
		Employee exemployee=employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("hell","o","exception"));
	    exemployee.setId(employee.getId());
		exemployee.setFirstName(employee.getFirstName());
	    exemployee.setLastName(employee.getLastName());
	    exemployee.setEmail(employee.getEmail());
	    employeeRepository.save(exemployee);
	    return exemployee;
	}
	@Override
	public void detete(Long id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id); 
	}
	

}
