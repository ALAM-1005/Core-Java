package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class CarMainClass {
	public static void main(String[] args) {

		
		Car c1 = new Car(10, "Ola");
		Car c2 = new Car(15, "Rapido");
		
		ArrayList<Car> al = new ArrayList<Car>();
		
		al.add(c1);
		al.add(c2);
		
		
		Iterator<Car> i = al.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());  // direct printing the object

			Car c = i.next();
			System.out.println(c);// printing the refrence variable
		}
		

	}
}
