package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class Runner {

	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Uday Sir");
		al.add("raghu Sir");
		al.add("Shishira Sir");
		
		
		Iterator<String> i = al.iterator();
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
	}
}
