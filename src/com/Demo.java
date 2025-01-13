package com;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		//ArrayList  l = new ArrayList();  //  specialization
		
		List l = new ArrayList();  // generalization or upcasting
		
		
		System.out.println(l.size()); // size of index
		l.add(10);//integer value
		l.add(1.2);//double value
		l.add("Java");//string value
		l.add(1);
		l.add(null); // null value
		l.add(10);  // dublication is allowed
		
		System.out.println(l); // printind the arrays
		System.out.println(l.get(2)); // get the element on the index number
		System.out.println(l.size());  // size of the arrays
		System.out.println("------------------------");
		System.out.println(l.contains("Java"));
		System.out.println(l.contains("java"));
		System.out.println("-------------------");
		System.out.println(l.isEmpty());
		System.out.println("-----------------");
		l.clear();
		System.out.println(l);
		System.out.println(l.isEmpty());
		
	}
}
