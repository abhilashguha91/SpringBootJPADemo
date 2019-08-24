package com.demo.springboot.jpa.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.springboot.jpa.entity.Employee;

@Service
public class EmployeeBusinessService {
	
	
	private List<Employee> listOfEmployees = new ArrayList(Arrays.asList(new Employee(101L, "Tom", 3000.00),
			new Employee(102L, "Sam", 4000.00),
			new Employee(103L, "Richard", 3500.00),
			new Employee(104L, "Bruce", 10000.00)
			));
	
	public List<Employee> getAlltopic(){
		return listOfEmployees;
	}
	
	public Employee getEmployeebyId(Long id){
		
		Employee topic = listOfEmployees.stream().filter(t -> t.getEmployeeId().equals(id)).findFirst().get();
		return topic;
	}
	
	public List<Employee> addEmployee(Employee t){
		listOfEmployees.add(t);
		return listOfEmployees;
	}
	
	public List<Employee> updateEmployee(Employee t, Long id){
		for(Employee employee : listOfEmployees) {
			if(employee.getEmployeeId().equals(id)) {
				employee.setEmployeeName(t.getEmployeeName());
				employee.setEmployeeSalary(t.getEmployeeSalary());
				
			}
		}
		return listOfEmployees;
	}
	
	public List<Employee> deleteEmployee(Long id){
		for(Employee employee : listOfEmployees) {
			if(employee.getEmployeeId().equals(id)) {
				listOfEmployees.remove(employee);
				break;
			}
		}
		return listOfEmployees;
	}

}
