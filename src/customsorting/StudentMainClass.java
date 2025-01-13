package customsorting;

import java.util.TreeSet;

public class StudentMainClass {


	public static void main(String[] args) {

		Student s1 = new Student(20, "Juned");
		Student s2 = new Student(21, "Jerry");
		Student s3 = new Student(22, "Jummy");

		TreeSet<Student> t = new TreeSet<Student>(new StudentNameComparator());
		//		TreeSet<Student> t1 = new TreeSet<Student>(new StudentAgeComparator());

		//		t1.add(s1);
		//		t1.add(s2);
		//		t1.add(s3);
		t.add(s1);
		t.add(s2);
		t.add(s3);
		for (Student s : t) {
			System.out.println(s);
		}

		//		for (Student s : t1) {
		//			System.out.println(s);
		//		}
	}
}
