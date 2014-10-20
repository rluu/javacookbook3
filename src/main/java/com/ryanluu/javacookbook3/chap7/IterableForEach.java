package com.ryanluu.javacookbook3.chap7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IterableForEach {
	public static void main(String[] args) {
		Collection<String> c = 
				Arrays.asList("one", "two", "three");
		
		// Java 8 method of iteration: Iterable.forEach method.
		System.out.println("Java 8 method of iteration:");
		c.forEach(s -> System.out.println(s));
		
		
		// Java 5 method of iteration: "foreach" loop.
		System.out.println("Java 5 method of iteration:");
		for (String s : c) {
			System.out.println(s);
		}
		
		// Java 2 method of iteration: Iterator.
		System.out.println("Java 2 method of iteration:");
		for (Iterator<String> i = c.iterator(); i.hasNext();) {
			String s = i.next();
			System.out.println(s);
		}
		
		
		
		
	}

}
