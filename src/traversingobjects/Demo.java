package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {


		ArrayList<Integer> al =new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);

//		for (Iterator i = al.iterator(); i.hasNext();) {
//			Integer integer = (Integer) i.next();
//			
//		}
		
		
		for (int i = 0; i < al.size(); i++) {
			
			
			System.out.println(al.get(i));
		}
		
		
		System.out.println("==============================");
		for (Integer i : al) {
			
			
			System.out.println(i);
		}
		
		System.out.println("===============================");
		
		Iterator<Integer> i = al.iterator();
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
	}
}
