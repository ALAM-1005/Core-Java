package mapexample;

import java.util.Set;
import java.util.TreeMap;

public class EmplyeeMainClass {
	
	
	public static void main(String[] args) {

		Employee e1 = new Employee(100);
		Employee e2 = new Employee(200);
		Employee e3 = new Employee(300);
		
		TreeMap<Employee, String> tm =new TreeMap<Employee, String>();
		
		tm.put(e1, "Tom");
		tm.put(e2, "Tomm");
		tm.put(e3, "Tome");
		
		Set<Employee> keys = tm.keySet();
		
		for (Employee emp : keys) {
			System.out.println(emp+"  ->  name:"+tm.get(emp));
		}
	}
}
