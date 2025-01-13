package org;

public class ForEachExample {
	public static void main(String[] args) {

		int[]a = {10,20,30};
		
		for(int i : a) {
			
			System.out.println(i);
		}
		System.out.println("--------------------------------");
		double[] marks = {20.52,25.3,45.4};
		for(double x: marks) {
			
			System.out.println(x);
		}
		System.out.println("-----------------------------");
		String[] subject = { "Maths","Hindi","English"};
		
		for(String s :subject) {
			
			System.out.println(s);
		}
		
	}
}
