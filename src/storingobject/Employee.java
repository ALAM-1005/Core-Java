package storingobject;

public class Employee {

	
	int id;
	int salary;
	String name;
	public Employee(int id, int salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	
	@Override
	
	public String toString() {
		
		return "id Number of  "+id+"  Emp "+name+" is  Salary ₹ "+salary ;
	}
}
