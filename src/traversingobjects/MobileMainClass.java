package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class MobileMainClass {
	public static void main(String[] args) {

		
		Mobile m1 = new Mobile("Apple", "16A", 150000);
		Mobile m2 = new Mobile("Apple", "15A", 130000);
		
		ArrayList<Mobile> al = new ArrayList<Mobile>();
		
		al.add(m1);
		al.add(m2);
		
		Iterator<Mobile> i = al.iterator();
		
		while(i.hasNext()) {
			
			Mobile m = i.next();
			
			System.out.println("Brand: "+m.brand+" ModelNo: "+m.modelNo+"  Cost:"+m.cost);
			
		}
	}
}
