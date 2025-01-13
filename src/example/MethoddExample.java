package example;

import java.util.ArrayList;
import java.util.LinkedList;

public class MethoddExample {
	public static void main(String[] args) {


		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		 LinkedList ll = new LinkedList();
		 
		 ll.addAll(al);
		 
		 ll.add(40);
		 
		 System.out.println(ll);
		 System.out.println("----------------");
		 
		 
		 
		 System.out.println(ll.containsAll(al));
		 System.out.println("----------------");
		 
		 ll.removeAll(al);
		 System.out.println(ll.containsAll(al));
		 System.out.println("----------------");
		 
		 System.out.println(ll);
		 
		 System.out.println("==========================");
		 
		 
		 ll.addAll(al);
		 System.out.println("Element"+ll+"   Size : "+ll.size());
		 
		 
		 System.out.println("===============================");
		 
		 
		 ll.add(al);
		 System.out.println("Element"+ll+"   Size : "+ll.size());
		 
		
	}
}

/**  
 * al-> ArrayList and ll-> LinkedList
 * 
 * 1.if we use al.addAll(ll); -> we are addind all the object of 1 collection into another collection
 * 1 by 1 (Sequentially).
 *  Therefore  elements -> [10,20,30] and size - 3.
 *  
 *  
 *  2. if we use ll.add(al);-> we r adding all the object of one collection into another collection as a single
 *  object
 *  
 *   therefore elements > [[10,20],30] size ->2
 */
