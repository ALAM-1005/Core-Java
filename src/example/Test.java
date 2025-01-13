package example;
import java.util.ArrayList;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		
		ArrayList<String> s = new ArrayList<String>();
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the name");
		String name = sc.next();
		
		int choice = sc.nextInt();
		s.add(name);
		for( choice = 1;choice >3;) {
		switch (choice) {
		case 1:
			System.out.println(s.reversed());
			break;
		case 2:
			break;
		default:
			break;
		}
	}
	}
}
