package com.REST_API.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import com.REST_API.entities.Employee;
import com.REST_API.service.EmployeeService;

@RestController
public class MyController {
	
	@Autowired
	private EmployeeService employeeService;
	
//	@GetMapping("/employees")
//	public ResponseEntity<List<Employee>> getEmployee(){
//		List<Employee> list=employeeService.getByClient();
//		if(list.size()<=0) {
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//			
//		}
//		return ResponseEntity.status(HttpStatus.CREATED).body(list);
//		
//	}
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getEmployee(){
		List<Employee> list=employeeService.getEmployee();
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}
	
	
}
