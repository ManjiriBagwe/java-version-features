package com.sunman.version.eight.javatechie.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo {

	public FilterDemo() {
		List<String> names = new ArrayList<String>();
		names.add("Manjiri");
		names.add("Vedant");
		names.add("Shashank");
		names.add("Pinka");
		names.add("Sunetra");

		//Old Traditional way 
		for(String name : names) {
			if(name.startsWith("S")) {
				System.out.println("Name : "+name);
			}
		}
		System.out.println("---------------");

		//With Stream and filter
		names.stream().filter(t -> t.startsWith("S")).forEach(t -> System.out.println(t));

		//Using Map
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "D");
		map.put(3, "S");
		map.put(8, "SC");

		map.entrySet().stream().filter(k -> k.getKey() % 2 == 0).forEach(object -> System.out.println("Object - "+object));
	}

	public static void main(String[] args) {
		new FilterDemo();
	}
}
