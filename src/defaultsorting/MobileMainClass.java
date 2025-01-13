package defaultsorting;

import java.util.TreeSet;

public class MobileMainClass {
	public static void main(String[] args) {


		Mobile m1 = new Mobile ("Iphone 16");
		Mobile  m2 = new Mobile ("Iphone 15");
		Mobile  m3 = new Mobile ("Iphone 15 pro");

		TreeSet<Mobile> t = new TreeSet<Mobile>();
		t.add(m1);
		t.add(m2);
		t.add(m3);

		for (Mobile m : t) {

			System.out.println(m);

		}

	}
}
