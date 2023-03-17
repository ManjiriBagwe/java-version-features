package com.sunman.version.eight;

interface Calculator {
	//int sum(int a, int b);
	int subtract(int a, int b);
}


public class CalculateImplementation {

	public CalculateImplementation() {
		//sumOf();
		differnceOf();
	}


	/*
	private void sumOf() { 
		Calculator calculator = (a, b) -> a + b;
		System.out.println(calculator.sum(4,80)); 
	}
	*/

	private void differnceOf() {
		Calculator calculator = (a, b) -> {
			if(a < b) {
				throw new RuntimeException("Subtractor is less than other");
			} 
			return a - b;
		};
		System.out.println(calculator.subtract(47,10));
	}
}
