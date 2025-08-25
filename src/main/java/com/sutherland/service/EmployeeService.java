package com.sutherland.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sutherland.beans.Employee;

@Service
public class EmployeeService {
	static List<Employee> emplist;
	static {
		emplist = Arrays.asList(new Employee(302, "reactjs", 7000),
				new Employee(101, "spring", 5000),
				new Employee(201, "james",40000 ),
				new Employee(202, "heloo",30000 ),
				new Employee(203, "hwello",60000 ));
				
	}
	public List<Employee> getEmployee(){
		return emplist;
	}

}
