package defaultsorting;

public class Student implements Comparable<Student> {

	
	int age;

	public Student(int age) {
	
		this.age = age;
	}
	
	
	@Override
	
	public String toString() {
		
		return "Age:"+age;
	}
	
	@Override
	
	public int compareTo(Student s) {
		
		return this.age - s.age;  // ascending order
		
		//return s.age - this.age;  //  descending order
	}
	
}


//this -> Current Object to be inserted
//s -> already exiting objects
