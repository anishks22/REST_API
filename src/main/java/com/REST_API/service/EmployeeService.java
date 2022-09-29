package com.REST_API.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.REST_API.dao.EmployeeRepository;
import com.REST_API.entities.Employee;

@Component
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
//	public List<Employee> getByClient(){
//		return employeeRepository.getByClientName();
//	}
	
	public List<Employee> getEmployee(){
		List<Employee> list= (List<Employee>)this.employeeRepository.findAll();
		
//		List<Employee> res=new ArrayList<>();
//		for(Employee emp : list) {
//			String cName= emp.getWorks_with().getClient().getClient_name();
//			if(emp.getSex()=='M' && cName.equals("FedEx") || cName.equals("Lackawana Country") ) {
//				res.add(emp);
//			}
//		}
		
		return list;
		
	}

	
}
