package com.aokon.playground.rest;

import com.aokon.playground.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestTest {


    @GetMapping("/customers")
    public List<Customer> getCustomer() {
        return List.of(new Customer("Andrzej", 42));
    }
}
