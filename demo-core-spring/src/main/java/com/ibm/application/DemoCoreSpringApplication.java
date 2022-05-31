package com.ibm.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.ibm.configuration.AppConfig;

//import com.ibm.configuration.EmployeeConfig;
//import com.ibm.configuration.HelloWorldConfig;
//import com.ibm.service.Employee;
//import com.ibm.service.HelloWorld;
import com.ibm.service.Customer;

@SpringBootApplication
@ComponentScan({"com.ibm.*"})   //scans stereotype annotation and create reference instance in string container
@Import({AppConfig.class})
@EnableAutoConfiguration
public class DemoCoreSpringApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(AppConfig.class);
		
		//HelloWorld hw = (HelloWorld) context.getBean("helloBean");
		//Employee emp = (Employee) context.getBean("employeeBean");
		Customer cust = (Customer) context.getBean("customerBean");

		//hw.printHelloWorld("Spring 5 up and running");
		
		//emp.createEmployee();
	    //emp.listEmployee();
	    
		System.out.println("\nThe details of the customers are : ");
	    cust.createCustomer();
	    cust.listCustomer();
	    cust.updateCustomer();
	    cust.deleteCustomer();
	    
	}

}
