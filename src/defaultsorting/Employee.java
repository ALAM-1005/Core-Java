package defaultsorting;

public class Employee  implements Comparable<Employee> {

	
	int id;
	String name;
	Double salary;  // wrapper class declaration to calls compareTo
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	
	public String toString() {
		
		return "ID:"+id+"  Name:"+name+"  Salary:"+salary;
	}
	
	@Override
	
	public int compareTo(Employee e) {
		
		return this.salary.compareTo(e.salary);
	}
	
	
}

/**
 * this-> current object to be inserted
 * e-> Already existing object
 * 
 * -> Sorting based on id(int):
 *   1.Ascending Order -> return this.id - e.id;
 *   2.Descending order -> return e.id - this.id;
 *   
 *   -> Sorting based on name(String):
 *   1.Ascending Order -> return this.name.compareTo(e.name);
 *   2.Descending order -> return e.name.compareTo(this.name);
 *   
 *   -> Sorting based on salary(Double):
 *   1.Ascending Order -> return this.salary.compare(e.salary);
 *   2.Descending order -> return e.salary.comapreTo(this.salary);
 * 
 */
