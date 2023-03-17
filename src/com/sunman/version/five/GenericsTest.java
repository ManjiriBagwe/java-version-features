package com.sunman.version.five;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericsTest {

	public GenericsTest() {
		/* Generics provides a way for you to communicate the type of a object to the compiler,
		 * so that it can be checked
		 * Map<String, List<String>> - Map is storing key has String type, and Value as List*/
		
		
		Map<String, List<String>> countryToStatesMap = new HashMap<String, List<String>>();
		
		List<String> stateOfIndia = new ArrayList<String>();
		stateOfIndia.add("Maharashtra");
		stateOfIndia.add("Karnataka");
		stateOfIndia.add("Kerla");
		stateOfIndia.add("Punjab");
		stateOfIndia.add("Assam");
		
		countryToStatesMap.put("India", stateOfIndia);
		
		List<String> stateOfUSA = new ArrayList<String>();
		stateOfUSA.add("North Carolina");
		stateOfUSA.add("New York");
		stateOfUSA.add("California");
		stateOfUSA.add("Texas");
		stateOfUSA.add("Arizona");
		
		countryToStatesMap.put("USA", stateOfUSA);
		
		System.out.println("countryToStatesMap : "+countryToStatesMap);
		
		
	}

}
