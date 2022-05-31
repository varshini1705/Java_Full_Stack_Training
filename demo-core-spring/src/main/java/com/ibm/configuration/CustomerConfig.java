package com.ibm.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ibm.service.Customer;
import com.ibm.service.CustomerImpl;

@Configuration
public class CustomerConfig {

	@Bean(name="customerBean")
	public Customer customer() {
        return new CustomerImpl();
    }
}
