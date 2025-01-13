package storingobject;

import java.util.LinkedList;

public class EmployeeMainClass {


	public static void main(String[] args) {


		Employee e1 = new Employee(1, 10000,"Tom");
		Employee e2 = new Employee(11, 20000,"Tommy");
		Employee e3 = new Employee(12, 10500,"Tom");
		
		LinkedList<Employee> ll = new LinkedList<Employee>();
		
		ll.add(e1);
		ll.add(e2);
		ll.add(e3);
		
		for(Employee emp :ll) {
			
			System.out.println(emp);
		}
			
	}
}
