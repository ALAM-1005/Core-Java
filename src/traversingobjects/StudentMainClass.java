package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentMainClass {
	public static void main(String[] args) {


		Student s1 = new Student(10, "Tom");
		Student s2 = new Student(15, "Jerry");

		ArrayList<Student> al = new ArrayList<Student>();

		al.add(s1);
		al.add(s2);

		Iterator<Student> i = al.iterator();

		while(i.hasNext()) {

			Student s = i.next();
			System.out.println(s.age+" "+s.name);
		}
	}
}
