package defaultsorting;

public class Car implements Comparable<Car>{
	
	Integer cost;
	String name;
	public Car(Integer cost, String name) {
		this.cost = cost;
		this.name = name;
	}
	
	@Override
	
	public String toString() {
		 
		return cost+" needs to buy "+name+" car";
	}
	
	@Override
	 
	 public int compareTo(Car c) {
		
		return this.cost.compareTo(c.cost);
	}
	
	
  
}
