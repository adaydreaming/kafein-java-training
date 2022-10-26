package com.kafein.javacourse.chapters.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collections {
	
	
	public static void main(String[] args) {
		List<String> catNameArray = new ArrayList<String>();
		catNameArray.add("Lion");
		catNameArray.add("Cat");
		catNameArray.add("Jaguar");
		catNameArray.add("Tiger");
		List<String> dogNameArray = new ArrayList<String>();
		dogNameArray.add("Dog");
		dogNameArray.add("Coyote");
		dogNameArray.add("Wolf");
		
		System.out.println("----------- Case 1 ---------------");
		for(String value : catNameArray) {
			System.out.println(value);
		}
		
		System.out.println("----------- Case 2 ---------------");
		if(catNameArray.contains("Lion")) {
			System.out.println("List has Lion value");
		} else {
			System.out.println("List has not Lion value");
		}
		
		System.out.println("----------- Case 3 ---------------");
		catNameArray.remove(0);
		if(catNameArray.contains("Lion")) {
			System.out.println("List has Lion value");
		} else {
			System.out.println("List has not Lion value");
		}
		
		System.out.println("----------- Case 4 ---------------");
		catNameArray.add("Tiger");
		for(String value : catNameArray) {
			System.out.println(value);
		}
		
		System.out.println("----------- Case 5 ---------------");
		Set<String> nameSet = new HashSet<>();
		for(String value : catNameArray) {
			nameSet.add(value);
		}
		for(String value : nameSet) {
			System.out.println(value);
		}
		
		System.out.println("----------- Case 6 ---------------");
		nameSet.add("Tiger");
		for(String value : nameSet) {
			System.out.println(value);
		}
		
		System.out.println("----------- Case 6 ---------------");
		Map<String, List<String>> animals = new HashMap<>();
		animals.put("Cats", catNameArray);
		animals.put("Dogs", dogNameArray);
		for(String value : animals.get("Dogs")) {
			System.out.println(value);
		}
		
		System.out.println("----------- Case 7 ---------------");
		for(Entry<String, List<String>> entry : animals.entrySet()) {
			System.out.println(entry.getKey() + " Values: ");
			for(String value : entry.getValue()) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}
