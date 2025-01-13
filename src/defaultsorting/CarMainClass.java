package defaultsorting;

import java.util.TreeSet;

public class CarMainClass {
	
	public static void main(String[] args) {

		
		Car c1 = new Car(251, "Mahendra");
		Car c2 = new Car(251, "BMW");
		Car c3 = new Car(252, "Tayota");
		
		TreeSet<Car> t = new TreeSet<Car>();
		t.add(c1);
		t.add(c2);
		t.add(c3);
		
		for (Car c : t) {
			
			System.out.println(c);
			
		}
		
	}
}
