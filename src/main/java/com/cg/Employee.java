package com.cg;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value ("${emp.id}")
	private int employeeId;
	
	@Value("${emp.name}")
	private String employeeName;
	
	@Value("${emp.salary}")
	private double salary;
	
	@Value("${emp.businessUnit}")
	private String businessUnit;
	
	@Value("${emp.age}")
	private int age;
    
    }
}
