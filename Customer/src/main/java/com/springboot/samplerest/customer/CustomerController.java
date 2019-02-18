package com.springboot.samplerest.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController{

    @GetMapping("/")
    public String getCustomer(){
        return "Customer get Method invoked..";
    }
}