package mapexample;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
	
	@Override
	
	public int compare(Student x , Student y) {
		
		return x.age - y.age;
	}

}
