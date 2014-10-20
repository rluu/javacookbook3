package com.ryanluu.javacookbook3.chap7;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArray {
	public static void main(String[] args) {
		String[] strings = {
				"painful",
				"mainly",
				"gaining",
				"raindrops"
		};
		
		
		List<String> l = new ArrayList<String>(Arrays.asList(strings));
		l.add("anotherItem");
		
		Arrays.sort(strings);
		
		for (int i = 0; i < strings.length; i++) {
			System.out.format("strings[%d] == %s%n", i, strings[i]);
		}
		
		System.out.println("");
		
		for (String s : l) {
			System.out.println("String: " + s);
		}
		
		
		System.out.println("");
	
		Collections.sort(l);
		
		for (String s : l) {
			System.out.println("String: " + s);
		}
		
		
	}
}
