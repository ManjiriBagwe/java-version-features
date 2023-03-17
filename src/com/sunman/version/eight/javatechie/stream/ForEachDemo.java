package com.sunman.version.eight.javatechie.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {

	public ForEachDemo() {
		
		List<String> names = new ArrayList<String>();
		names.add("Manjiri");
		names.add("Vedant");
		names.add("Shashank");
		names.add("Pinka");
		names.add("Sunetra");

		//Old Traditional way 
		for(String name : names) {
			System.out.println("Name : "+name);
		}
		System.out.println("---------------");

		//With Stream and forEach
		names.stream().forEach(System.out::println);

		//Using Map
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "D");
		map.put(3, "S");

		map.forEach((key, value) -> System.out.println("Key : "+key+", Value : "+value));
		map.entrySet().stream().forEach(object -> System.out.println("Object - "+object));

		//Using Consumer interface
		Consumer<String> consumer = (t) -> { System.out.println("Value : "+t); };
		for(String name : names) {
			consumer.accept(name);
		}
	}

	public static void main(String[] args) {
		new ForEachDemo();
	}
}
