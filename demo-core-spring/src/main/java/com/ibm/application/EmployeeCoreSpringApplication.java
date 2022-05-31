/**
 * 
 */
package com.ibm.application;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.ibm.configuration.AppConfig;
import com.ibm.service.Employee;
import com.ibm.service.EmployeeImpl;

@SpringBootApplication
@ComponentScan({"com.ibm.*"}) 
@Import({AppConfig.class})
@EnableAutoConfiguration
public class EmployeeCoreSpringApplication
{
	public static void main(String[] args)
	{
		Employee emp=new EmployeeImpl();
	
		emp.createEmployee();
		emp.listEmployee();
	}

}
