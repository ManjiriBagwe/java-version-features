package com.sunman.version.five;

import java.util.ArrayList;
import java.util.List;

public class ForEachTest {

	public ForEachTest() {
		List<String> sampleList = new ArrayList<String>();
		sampleList.add("Manjiri");
		sampleList.add("Sunetra");
		sampleList.add("Rani");


		/* Old Practice for looping. */
		for (int i = 0; i < sampleList.size(); i++) {
			System.out.println("Name : "+sampleList.get(i));
		}


		/*New Way for looping */
		for(String name: sampleList) {
			System.out.println("New Name : "+name);
		}
		
		
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(2);
		numList.add(5);
		numList.add(45);
		
		Integer addition = 0;
		for(Integer number : numList) {
			addition = addition + number;
		}
		System.out.println("Addion : "+addition);
	}

}
