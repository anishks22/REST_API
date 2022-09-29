package com.REST_API.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.REST_API.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
//
////	@Query("select e.first_name,e.last_name,e.sex,c.client_name,w.total_sales from employee e join works_with w on e.emp_id = w.emp_id join client c on w.client_id=c.client_id where e.sex='m' and ( c.client_name='FedEx' or c.client_name='Lackawana Country')")
	List<Employee> getAll();
	
//	@Query("select first_name from employee where sex='M'")
//	List<Employee> getByClientName();
}
