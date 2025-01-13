package example;

import java.util.ArrayList;
import java.util.Collections;

public class Runner {
	public static void main(String[] args) {



		ArrayList al = new ArrayList();

		al.add(10);
		al.add("True");
		al.add(23);
		System.out.println(al);
		//Collections.sort(al);  only same data type
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);


		System.out.println("---------------------------------");

		ArrayList<Integer> l = new ArrayList<Integer>();

		l.add(10);
		l.add(20);
		l.add(30);
		
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);

	}
}
