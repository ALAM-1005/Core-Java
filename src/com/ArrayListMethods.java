package com;

import java.util.ArrayList;

public class ArrayListMethods {

	
	public static void main(String[] args) {
		
		
		// ineternally an arrays gets created of default initial capacity
		
		ArrayList a = new ArrayList();
		
		
		// ineternally an arrays gets created of custom initial capacity
		ArrayList b = new ArrayList(20);
		
		
		ArrayList x = new ArrayList();
		x.add(10);
		x.add(20);
		
		
		// Add one collection into another collection
		ArrayList y = new ArrayList(x);
		
		y.add(30);
		
		System.out.println(x);
		System.out.println(y);
		
		
	}
}
