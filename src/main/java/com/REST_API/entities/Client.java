package com.REST_API.entities;

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
import javax.persistence.Table;

import net.bytebuddy.utility.nullability.NeverNull;

@Entity
@Table(name="client")
public class Client{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NeverNull
	private int client_id;
	
	@Column(length=40)
	private String client_name;
	
//	, fetch = FetchType.LAZY
	@OneToMany(cascade = CascadeType.ALL,mappedBy="client")
	private Set<Works_With> works_with=new HashSet<>();
	
	

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Client(int client_id, String client_name, Set<Works_With> works_with) {
		super();
		this.client_id = client_id;
		this.client_name = client_name;
		this.works_with = works_with;
	}



	public int getClient_id() {
		return client_id;
	}

	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	public Set<Works_With> getWorks_with() {
		return works_with;
	}

	public void setWorks_with(Set<Works_With> works_with) {
		this.works_with = works_with;
	}

	@Override
	public String toString() {
		return "Client [client_id=" + client_id + ", client_name=" + client_name + ", works_with=" + works_with + "]";
	}
	

//	 
	
	
}
