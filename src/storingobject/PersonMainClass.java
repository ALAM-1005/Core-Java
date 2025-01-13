package storingobject;

import java.util.ArrayList;

public class PersonMainClass {

	
	public static void main(String[] args) {
		
		
		Person p1 = new Person(20, "Arun");
		Person p2 = new Person(20, "Tarun");
		Person p3 = new Person(20, "amar");
		
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		
		

		for(Person p : al) {
			
			if(p.name.startsWith("A") || p.name.startsWith("a"))  //p.name.charAt(0) == 'A'
			System.out.println(p);
		}
		
	}
}
