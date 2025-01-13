package org;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		ArrayList l = new  ArrayList();
		l.add(12);
		l.add(35);
		l.add(56);
		
		System.out.println(l);
		l.add(1,55);//it is used to add element but remaining elements are shifted.
		System.out.println(l);
		l.set(2,77);  //it is used to add the elements the object but overridden(paste).
		System.out.println(l);
	}

}
