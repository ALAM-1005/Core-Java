package org;

import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {

		
		LinkedList l = new LinkedList();
		
		l.add("Hello");
		l.add("Collection");
		l.add(2024);
		//forward traversing 
		for(int i =0;i<l.size();i++) {
			
			System.out.println(l.get(i));
		}
		
		System.out.println("-------------------------");
		//Backward traversing 
		for(int i=l.size()-1;i>=0;i--) {
			
			System.out.println(l.get(i));
		}
		
	}

}
