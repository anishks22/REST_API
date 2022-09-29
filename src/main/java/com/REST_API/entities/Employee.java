package com.REST_API.entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import net.bytebuddy.utility.nullability.NeverNull;


@Entity
@Table(name="employee")
public class Employee{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NeverNull
	private int emp_id;
	
	@Column(length=40)
	private String first_name;
	
	@Column(length=40)
	private String last_name;
	
	private Date date;
	
	private char sex;
	
	private int salary;
	

//	(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@OneToOne
	private Works_With works_with;
	
//	@OneToOne
//	private Client client;
//
//	
//	public Client getClient() {
//		return client;
//	}
//
//
//	public void setClient(Client client) {
//		this.client = client;
//	}


	public Works_With getWorks_with() {
		return works_with;
	}


	public void setWorks_with(Works_With works_with) {
		this.works_with = works_with;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Employee(int emp_id, String first_name, String last_name, Date date, char sex, int salary) {
		super();
		this.emp_id = emp_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.date = date;
		this.sex = sex;
		this.salary = salary;
	
	}


	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

//	public Set<Works_With> getWorks_with() {
//		return works_with;
//	}
//
//	public void setWorks_with(Set<Works_With> works_with) {
//		this.works_with = works_with;
//	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", first_name=" + first_name + ", last_name=" + last_name + ", date="
				+ date + ", sex=" + sex + ", salary=" + salary + "]";
	}
  
//	+ ", works_with=" + works_with 
	
	
	
}
