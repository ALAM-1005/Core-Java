package mapexample;

import java.util.LinkedHashMap;
import java.util.Set;

public class CarMainClass {

	
	public static void main(String[] args) {
		
		
		Car c1 =new Car("Audi");
		Car c2 =new Car("BMW");
		Car c3 =new Car("Tayota");
		
		LinkedHashMap<Car, Integer> lh = new LinkedHashMap<Car, Integer>();
		
		lh.put(c1, 5000);
		lh.put(c2, 5500);
		lh.put(c3, 5200);
		
		Set<Car> keys = lh.keySet();
		
		for(Car c :keys) {
			
			System.out.println(c+"   ->  cost : "+lh.get(c));
		}
	}
}
