package com.aokon.playground.rest;

import com.aokon.playground.infrastructure.CustomerEntity;
import com.aokon.playground.infrastructure.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class RestTest {

    CustomerRepository customerRepository;


    @GetMapping("/customers")
    public List<CustomerEntity> getCustomer() {
        customerRepository.save(new CustomerEntity(null,"AndNew","ITGuy",1005));
        List<CustomerEntity> allCustomers = customerRepository.findAll();
        return allCustomers;
    }
}
