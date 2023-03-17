package com.sunman.version.eight.javatechie.stream.realexample;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

	public EmployeeService() {
		getTaxableEmployees();
		getNonTaxableEmployees();
		System.out.println("Cr : "+getEmployeesOnTaxCritiria("sds"));
	}


	public void getTaxableEmployees() {
		List<Employee> taxableEmployee = new EmployeeDao().getEmployees().stream().filter(emp -> emp.getSalary() > 20000).collect(Collectors.toList());
		System.out.println(taxableEmployee);
	}

	public void getNonTaxableEmployees() {
		List<Employee> nonTaxableEmployee = new EmployeeDao().getEmployees().stream().filter(emp -> emp.getSalary() <= 20000).collect(Collectors.toList());
		System.out.println(nonTaxableEmployee);
	}

	/* Using Ternary operator on if-else loop. */
	public List<Employee> getEmployeesOnTaxCritiria(String critiria) {
		return (critiria.equals("Taxable"))
				?new EmployeeDao().getEmployees().stream().filter(emp -> emp.getSalary() < 20000).collect(Collectors.toList())
				:new EmployeeDao().getEmployees().stream().filter(emp -> emp.getSalary() > 20000).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		new EmployeeService();
	}
}
