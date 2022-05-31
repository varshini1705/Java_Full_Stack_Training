package com.ibm.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//This is an app config class which is a module configuration of the various spring pojo classes using
//by @configuration annotation
@Configuration
@Import({EmployeeConfig.class,HelloWorldConfig.class, CustomerConfig.class})
public class AppConfig {
	
	
}
	

