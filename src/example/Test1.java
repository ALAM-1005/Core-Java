package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Abhi");
		al.add("Junad");
		al.add("Jerry");
		al.add("Tom");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Write your choice : ");
		int choice = sc.nextInt();
		
		switch(choice){
		case 1 : Collections.sort(al);	
		for(String s : al) {
			System.out.println(s);
		}
		break;
		case 2 : Collections.sort(al);
		Collections.reverse(al);
		for(String s1 : al ) {
			System.out.println(s1);
		}
		break;
		
			
		}
	}
}
