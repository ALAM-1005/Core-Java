package storingobject;

import java.util.ArrayList;

public class StudentMainClass {


	public static void main(String[] args) {
		
		Student s1 = new Student(20, "Tom");
		Student s2 = new Student(21, "Tommy");
		Student s3 = new Student(20, "Tommer");

		ArrayList<Student>  al = new ArrayList<Student>();
		al.add(s1);  // al.add(new Student(20, "Tom"));
		al.add(s2);  
		al.add(s3);
		
		for(Student obj : al) {
			
			System.out.println(obj);  // printing ref var -> s1,s2,s3 -> toString()
		}
		
		System.out.println("--------------------------");
		
		for(int i =0;i<al.size();i++) {
			
			System.out.println(al.get(i));
		}
		
	}
}
