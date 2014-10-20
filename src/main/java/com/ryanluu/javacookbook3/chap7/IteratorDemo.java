package com.ryanluu.javacookbook3.chap7;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class IteratorDemo {
	public static void main(String[] args) {
		List<Date> l = new ArrayList<>();
		
		l.add(new Date());
		l.add(new Date());
		l.add(new Date());
		
		int i = 0;
		
		Iterator<Date> it = l.iterator();
		
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println("Element" + i++ + " = " + o);
		}
	}
}
