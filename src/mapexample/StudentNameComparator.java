package mapexample;

import java.util.Comparator;

public class StudentNameComparator  implements Comparator<Student>{
	
	@Override
	
	public int compare(Student a ,Student b) {
		
		return a.name.compareTo(b.name);
	}
 
}
