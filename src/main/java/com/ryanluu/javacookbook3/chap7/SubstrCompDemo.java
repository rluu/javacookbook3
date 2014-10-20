package com.ryanluu.javacookbook3.chap7;

import java.util.Arrays;

public class SubstrCompDemo {
	public static void main(String[] args) {
		String[] strings = {
				"painful",
				"mainly",
				"gaining",
				"raindrops"
		};
		
		Arrays.sort(strings);
		SubstrCompDemo.dump(strings, "Using default sort");
		
		Arrays.sort(strings, new SubstringComparator());
		SubstrCompDemo.dump(strings, "Using SubstringComparator to sort");
		
		
	}
	
	private static void dump(String[] a, String title) {
		
		System.out.println(title);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
