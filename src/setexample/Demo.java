package setexample;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();  // Insertion is not maintain
		hs.add(10);
		hs.add(10);
		hs.add("Java");
		hs.add(20);
		
		
		System.out.println(hs.size());
		
		for(Object obj : hs) {
			
			System.out.println(obj);
		}
		
		System.out.println("------------------------------S");
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();  // insertion order is maintain
		
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(10);
		
		System.out.println(lhs.size());
		
		for(int i :lhs) {
			
			System.out.println(i);
		}
		
	}
}
