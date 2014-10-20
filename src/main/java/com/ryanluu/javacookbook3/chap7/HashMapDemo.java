package com.ryanluu.javacookbook3.chap7;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		

		Map<String,String> map = new HashMap<String,String>();
		
		// Add some entries to the hashmap. 
		map.put("Adobe", "Mountain View, CA");
		map.put("IBM", "White PLains, NY");
		map.put("Learning Tree", "Los Angeles, CA");
		map.put("Microsoft", "Redmond, WA");
		map.put("Netscape", "Mountain View, CA");
		map.put("O'Reilly", "Sebastopol, CA");
		map.put("Sun", "Mountain View, CA");
		
		// Grab one key, value pair, manually.
		String key = "IBM";
		String value = map.get(key);
		System.out.format("For key %s, the value is: %s", key, value);
		
		
		for (String k : map.keySet()) {
			System.out.println("Key " + k + "; Value " + map.get(key));
		}
		
		
	}

}
