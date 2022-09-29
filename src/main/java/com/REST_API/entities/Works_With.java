package com.REST_API.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="works_with")
public class Works_With implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int emp_id;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int client_id;
	
	private int total_sales;
	
	@OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "emp_id")
    private Employee employee;
	
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;

	
	public Works_With() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Works_With(int emp_id, int client_id, int total_sales, Employee employee, Client client) {
		super();
		this.emp_id = emp_id;
		this.client_id = client_id;
		this.total_sales = total_sales;
		this.employee = employee;
		this.client = client;
	}


	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getClient_id() {
		return client_id;
	}

	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	public int getTotal_sales() {
		return total_sales;
	}

	public void setTotal_sales(int total_sales) {
		this.total_sales = total_sales;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Works_With [emp_id=" + emp_id + ", client_id=" + client_id + ", total_sales=" + total_sales
				+ ", employee=" + employee + ", client=" + client + "]";
	}
	
	

	
		
	
}
