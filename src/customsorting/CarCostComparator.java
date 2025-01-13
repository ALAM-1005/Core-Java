package customsorting;

import java.util.Comparator;

public class CarCostComparator  implements Comparator<Car>{

	
	@Override
	public int compare(Car x,Car Y) {
		
		 //return x.cost -Y.cost; 
		return Y.name.compareTo(Y.name);
	}
}


//x-> current object to be inserted
//Y -> already existing object