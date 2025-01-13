package defaultsorting;

import java.util.TreeSet;

public class PersonMainClass {
	public static void main(String[] args) {

		Person p1 = new Person(20, "suriya");
		Person p2 = new Person(21, "suniya");
		Person p3 = new Person(22, "sumiya");
		
		TreeSet<Person> t = new TreeSet<Person>();
		
		t.add(p1);
		t.add(p2);
		t.add(p3);
		
		for (Person p : t) {
			
			System.out.println(p);
		}		
		
	}
}
