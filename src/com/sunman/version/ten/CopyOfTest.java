package com.sunman.version.ten;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CopyOfTest {

	public CopyOfTest() {
		List<String> sampleList = new ArrayList<String>();
		sampleList.add("Manjiri");
		sampleList.add("Sunetra");
		sampleList.add("Rani");

		List<String> copyOfSampleList = List.copyOf(sampleList);

		System.out.println("List Before : "+sampleList);
		System.out.println("Copy List Before : "+copyOfSampleList);

		sampleList.add("Pinka");

		try {
			copyOfSampleList.add("Pinka"); // This list is unmodifiable, throws java.lang.UnsupportedOperationException
		} catch (UnsupportedOperationException e) {
			System.out.println("Error message : "+e.getMessage());
		}

		System.out.println("List After : "+sampleList);
		System.out.println("Copy List After : "+copyOfSampleList);

		System.out.println("--------------------------------");

		/* Same method available for Map too. */

		Map<String, String> sampleMap = new HashMap<String, String>();
		sampleMap.put("Manjiri", "Bagwe");
		sampleMap.put("Sunetra", "Chavan");
		sampleMap.put("Rani", "Chavan");

		Map<String, String> copyOfSampleMap = Map.copyOf(sampleMap);

		System.out.println("Map Before : "+sampleMap);
		System.out.println("Copy Map Before : "+copyOfSampleMap);

		sampleMap.put("Pinka","Chavan");

		try {
			copyOfSampleMap.put("Pinka", "Chavan"); // This list is unmodifiable, throws java.lang.UnsupportedOperationException
		} catch (UnsupportedOperationException e) {
			System.out.println("Error message : "+e.getMessage());
		}

		System.out.println("Map After : "+sampleMap);
		System.out.println("Copy Map After : "+copyOfSampleMap);

		System.out.println("--------------------------------");

		/* If try to copy immutable map/list, java won't create another copy, return same object.*/
		Map<String, String> secondCopyOfSampleMap = Map.copyOf(copyOfSampleMap);
		System.out.println("copyOfSampleMap : "+copyOfSampleMap.hashCode()+", SecondcopyOfSampleMap : "+secondCopyOfSampleMap.hashCode());
	}

}
