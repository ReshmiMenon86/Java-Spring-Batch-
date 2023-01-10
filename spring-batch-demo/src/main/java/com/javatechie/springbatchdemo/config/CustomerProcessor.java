package com.javatechie.springbatchdemo.config;

import com.javatechie.springbatchdemo.entity.Customer;
import lombok.AllArgsConstructor;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {
    @Override
    public Customer process(Customer customer) throws Exception{
        return customer;
    }
}

