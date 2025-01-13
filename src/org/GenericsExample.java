package org;
import java.util.ArrayList;
import java.util.LinkedList;
public class GenericsExample {

	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(30);
		
		for(int i : al) {  // for(Integer i : al)
			
			
			System.out.println(i);
		}
		
		System.out.println("-------------------");
		 
		LinkedList<Double> dd = new LinkedList<Double>();
		dd.add(10.0);
		dd.add(20.3);
		dd.add(15.3);
		
		for(double x:dd) {
			
			System.out.println(x);
		}
	}
}
