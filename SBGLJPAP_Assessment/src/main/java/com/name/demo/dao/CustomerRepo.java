package com.name.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.name.demo.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> 
{

}

