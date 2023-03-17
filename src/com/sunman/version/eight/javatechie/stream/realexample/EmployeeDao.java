package com.sunman.version.eight.javatechie.stream.realexample;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

	public EmployeeDao() {

	}

	public List<Employee> getEmployees() {

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Manjiri", "IT", 10000));
		employees.add(new Employee(2, "Shashank", "SALES", 20000));
		employees.add(new Employee(3, "Vedant", "SCHOOL", 30000));
		employees.add(new Employee(4, "Mukund", "Admin", 40000));
		employees.add(new Employee(5, "Suchitra", "HR", 50000));
		return employees;
	}

}
