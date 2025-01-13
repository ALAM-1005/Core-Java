package mapexample;

public class Employee  implements Comparable<Employee> {

	
	int id;

	public Employee(int id) {
		
		this.id = id;
	}
	
@Override
	
	public String toString() {
		
		return "Id:"+id;
	}

@Override

public int compareTo(Employee e) {
	
	
	return this.id - e.id;
}
	
}
