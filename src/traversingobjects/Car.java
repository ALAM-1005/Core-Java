package traversingobjects;

public class Car {
 
	
	int cost;
	String brand;
	public Car(int cost, String brand) {
		
		this.cost = cost;
		this.brand = brand;
	}
	
	@Override
	
	public String toString() {
		
		return "Brand :" +brand +" Cost: "+ cost;
	}
	
	
}
