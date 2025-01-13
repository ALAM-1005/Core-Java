package customsorting;

import java.util.ArrayList;
import java.util.Collections;

public class CarMainClass {

	
	public static void main(String[] args) {
		
		
		Car c1 = new Car("abhi");
		Car c2 = new Car("jik");
		Car c3 = new Car("dfr");
		
//		CarCostComparator cost	=new CarCostComparator();
//		TreeSet<Car> t = new TreeSet<Car>();
		
		
//		TreeSet<Car> t = new TreeSet<Car>(new CarCostComparator()) ;
//			t.add(c1);
//			t.add(c2);
//			t.add(c3);
			
		
		ArrayList<Car> al = new ArrayList<Car>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		Collections.sort(al, new CarCostComparator());
		//{
//			@Override
//			public int compare(Car x,Car Y) {
//				
//				return x.cost -Y.cost;  //return Y.cost - x.cost ;
//			}
//		});
			for (Car c : al) {
				
				System.out.println(c);
			}
		}
	}
	
	

