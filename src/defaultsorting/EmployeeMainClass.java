package defaultsorting;

import java.util.TreeSet;

public class EmployeeMainClass {


	public static void main(String[] args) {

		Employee e1 = new Employee(100, "Suresh", 120.2);
		Employee e2 = new Employee(101, "Sumesh", 130.3);
		Employee e3 = new Employee(103, "Survesh", 140.4);
		
		
		TreeSet<Employee>t = new TreeSet<Employee>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		
		for (Employee e : t) {
			
			
			System.out.println(e);
		}
	}
}
