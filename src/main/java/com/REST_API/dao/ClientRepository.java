package com.REST_API.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.REST_API.entities.Client;



public interface ClientRepository extends JpaRepository<Client,Long>{

}
