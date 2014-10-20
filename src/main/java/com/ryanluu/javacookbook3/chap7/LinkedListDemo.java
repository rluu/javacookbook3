package com.ryanluu.javacookbook3.chap7;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		System.out.println("Here is a demo fo Java's LinkedList class");
		LinkedList<String> l = new LinkedList<>();
		l.add(new Object().toString());
		l.add("Hello");
		l.add("end of the list");
		
		System.out.println("here is a list of all the elements");
		ListIterator<String> li = l.listIterator(0);
		while (li.hasNext()) {
			System.out.println("Next to: " + li.next());
		}
		
		if (l.indexOf("hello") < 0) {
			System.err.println("Lookup does not work");
		}
		else {
			System.err.println("Lookup works");
		}
		
		// Walking the linked list backwards.
		while (li.hasPrevious()) {
			System.out.println("Back to: " + li.previous());
		}
	}

}
