package com.javatechie.springbatchdemo.repository;

import com.javatechie.springbatchdemo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends  JpaRepository <Customer,Integer> {
}
