package com.sunman.version.eight.javatechie.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.sunman.version.eight.javatechie.stream.realexample.Employee;

public class MapSortingDemo {

	public MapSortingDemo() {
		sortMapOnKeys();
		sortMapOnValue();
		sortMapOnKeysWithLambda();
		sortMapOnValuesWithLambda();
		sortMapOnKeysWithLambdaAndStream();
		sortMapOnValuesWithLambdaAndStream();
		sortEmployee();
		sortEmployeeWithLambda();
		sortEmployeeWithLambdaAndStream();
		
	}


	private void sortEmployeeWithLambdaAndStream() {
		Map<Employee, Integer> employeeMap = new HashMap<Employee, Integer>();
		employeeMap.put(new Employee(1, "Manjiri", "IT", 100100), 10);
		employeeMap.put(new Employee(2, "Shashank", "SALES", 40000), 100);
		employeeMap.put(new Employee(3, "Vedant", "SCHOOL", 30000), 52);
		employeeMap.put(new Employee(4, "Mukund", "Admin", 40010), 23);
		employeeMap.put(new Employee(5, "Suchitra", "HR", 50000), 85);
		
		System.out.println(employeeMap);
		
		//Based on salary
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println); //ACS
		//employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);//DESC
		System.out.println("---------------");
		//Based on name
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).forEach(System.out::println); //ASC
		//employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed())).forEach(System.out::println); //DSC
		System.out.println("---------------");
		//Based on department name
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDepartment))).forEach(System.out::println); //ASC
		//employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDepartment).reversed())).forEach(System.out::println);//DES
		System.out.println("---------------");
		
		//Value is primitive type, so comparingByValue give compilation error
		//employeeMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getSalary))).forEach(System.out::println); //ACS
				
	}


	private void sortEmployee() {
		Map<Employee, Integer> employeeMap = new TreeMap<Employee, Integer>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int)o1.getSalary() - o2.getSalary();
				
			}
			
		});
		employeeMap.put(new Employee(1, "Manjiri", "IT", 10000), 10);
		employeeMap.put(new Employee(2, "Shashank", "SALES", 40000), 100);
		employeeMap.put(new Employee(3, "Vedant", "SCHOOL", 30000), 52);
		employeeMap.put(new Employee(4, "Mukund", "Admin", 40010), 23);
		employeeMap.put(new Employee(5, "Suchitra", "HR", 50000), 85);
		
		System.out.println(employeeMap);
		
	}
	
	
	private void sortEmployeeWithLambda() {
		//Map<Employee, Integer> employeeMap = new TreeMap<Employee, Integer>((Employee o1, Employee o2) -> (int)o1.getSalary() - o2.getSalary()); //Asc
		Map<Employee, Integer> employeeMap = new TreeMap<Employee, Integer>((Employee o1, Employee o2) -> (int)o2.getSalary() - o1.getSalary()); //Desc
		employeeMap.put(new Employee(1, "Manjiri", "IT", 15000), 10);
		employeeMap.put(new Employee(2, "Shashank", "SALES", 410000), 100);
		employeeMap.put(new Employee(3, "Vedant", "SCHOOL", 304000), 52);
		employeeMap.put(new Employee(4, "Mukund", "Admin", 240010), 23);
		employeeMap.put(new Employee(5, "Suchitra", "HR", 450000), 85);
		
		System.out.println(employeeMap);
		
	}


	private void sortMapOnValuesWithLambdaAndStream() {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Five", 5);
		map.put("ONe", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Seven", 7);
		map.put("Six", 6);
		map.put("Eleven", 11);
		System.out.println(map);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println); //Asc
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue().reversed()).forEach(System.out::println); //Desc
	}


	private void sortMapOnKeysWithLambdaAndStream() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Five", 5);
		map.put("ONe", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Seven", 7);
		map.put("Six", 6);
		map.put("Eleven", 11);
		System.out.println(map);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	}


	private void sortMapOnKeysWithLambda() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Five", 5);
		map.put("ONe", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Seven", 7);
		map.put("Six", 6);
		map.put("Eleven", 11);
		System.out.println(map);
		
		//2. With Lambda
		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
		for(Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey()+", "+entry.getValue());
		}
	}
	
	private void sortMapOnValuesWithLambda() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Five", 5);
		map.put("ONe", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Seven", 7);
		map.put("Six", 6);
		map.put("Eleven", 11);
		System.out.println(map);
		
		//2. With Lambda
		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		for(Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey()+", "+entry.getValue());
		}
	}

	
	private void sortMapOnKeys() {
		//1. Traditional Way
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Five", 5);
		map.put("ONe", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Seven", 7);
		map.put("Six", 6);
		System.out.println(map);

		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey()); //ASC
				//return o2.getKey().compareTo(o1.getKey()); //DEC
			}
		});

		for(Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey()+", "+entry.getValue());
		}
	}

	private void sortMapOnValue() {
		//1. Traditional Way
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Five", 5);
		map.put("ONe", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Seven", 7);
		map.put("Six", 6);
		System.out.println(map);

		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue()); //ASC
				//return o2.getValue().compareTo(o1.getValue()); //DEC
			}
		});

		for(Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey()+", "+entry.getValue());
		}
	}

	public static void main(String[] args) {
		new MapSortingDemo();
	}

}
