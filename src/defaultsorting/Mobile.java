package defaultsorting;

public class Mobile implements Comparable<Mobile> {

		String brand;
		public Mobile(String brand) {

			this.brand = brand;
			
		}

		
		@Override
		
		public String toString() {
			
			return "Mobile Brand is "+brand;
		}
		
		@Override
		 
		 public int compareTo(Mobile m) {
			
			return this.brand.compareTo(m.brand);
		}
		
		
	  
	}


