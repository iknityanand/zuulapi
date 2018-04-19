package com.brownie.zuulapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brownie.zuulapi.domain.Employee;



@RestController
public class EmployeeController {
	
	@GetMapping(value="/employee")
	public Employee firstPage() {
		Employee emp=new Employee();
		emp.setEmpId("1");
		emp.setName("Nityanand");
		emp.setDesignation("Software Engineer");
		emp.setSalary(2000);
		return emp;
		
	}

}
