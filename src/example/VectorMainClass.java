package example;

import java.util.Vector;

public class VectorMainClass {

	
	public static void main(String[] args) {
		
		
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(10);
		v.add(20);
		v.add(30);
		
		for (Integer i : v) {  // for each loop
			System.out.println(i);
		}
	
		System.out.println("---------------------------");
		
		
		for(int i =0;i<v.size();i++) {  // for loop
			System.out.println(v.get(i));
		}
		
	}
}
