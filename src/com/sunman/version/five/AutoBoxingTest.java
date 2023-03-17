package com.sunman.version.five;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingTest {

	/* This allows primitive data type to be consider as Object. int -> Integer*/
	public AutoBoxingTest() {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(2);
		numList.add(5);
		numList.add(45);

		
		for (int i = 0; i < numList.size(); i++) {
			Integer num  = numList.get(i);
			System.out.println("Number : "+num);
		}
	}
}



