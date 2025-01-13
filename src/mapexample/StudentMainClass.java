package mapexample;

import java.util.Set;
import java.util.TreeMap;

public class StudentMainClass {

	
	public static void main(String[] args) {
		
		
		Student s1 = new Student(10, "Abi");
		Student s2 = new Student(11, "Ab");
		Student s3 = new Student(12, "Abin");
		
		
		
		TreeMap<Student, Integer> tm = new TreeMap<Student, Integer>(new StudentAgeComparator());
		TreeMap<Student, Integer> t = new TreeMap<Student, Integer>(new StudentNameComparator());
		
		tm.put(s1, 50);
		tm.put(s2, 150);
		tm.put(s3, 550);
		
		
		Set<Student> keys = tm.keySet();
		
		for (Student s: keys) {
			  System.out.println(s+"-> marks:"+tm.get(s));
		}
	}
}
