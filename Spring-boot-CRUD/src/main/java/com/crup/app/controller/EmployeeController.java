package com.crup.app.controller;

import java.util.List;
import com.crup.app.service.impl.EmployeeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crup.app.model.Employee;
import com.crup.app.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private final EmployeeServiceImpl employeeServiceImpl;
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService, EmployeeServiceImpl employeeServiceImpl) {
		super();
		this.employeeService = employeeService;
		this.employeeServiceImpl = employeeServiceImpl;
	}
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
		
	}
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
		
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Employee> getId(@PathVariable("id") Long id){
		return new ResponseEntity<Employee>(employeeService.getById(id),HttpStatus.ACCEPTED);
		
	}
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp,@PathVariable Long id){
		return new ResponseEntity<Employee>(employeeService.update(emp,id),HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Long id){
		employeeService.detete(id);
		return new ResponseEntity<String>("Employee deleted",HttpStatus.OK);
	}

}
