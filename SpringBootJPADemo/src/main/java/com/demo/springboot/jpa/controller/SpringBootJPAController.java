package com.demo.springboot.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springboot.jpa.entity.Employee;
import com.demo.springboot.jpa.service.EmployeeBusinessService;

@RestController
public class SpringBootJPAController {
	
	@Autowired
	EmployeeBusinessService service;
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployees(){
		
		return service.getAlltopic();
	}
	
	@RequestMapping("/employees/{id}")
	public Employee getEmployeeByEmpId(@PathVariable String id){
		
		return service.getEmployeebyId(Long.parseLong(id));	
	}
	
	@RequestMapping("/employees")
	public List<Employee> addEmployee(@RequestBody Employee emp){
		
		return service.addEmployee(emp);
	}
	
	@RequestMapping("/employees/{id}")
	public List<Employee> updateEmployeeDetails(@RequestBody Employee emp, @PathVariable String id){
		
		return service.updateEmployee(emp, Long.parseLong(id));
	}
	
	@RequestMapping("/employees/{id}")
	public List<Employee> deleteEmployee(@PathVariable String id){
		
		return service.deleteEmployee(Long.parseLong(id));
	}
	

}
