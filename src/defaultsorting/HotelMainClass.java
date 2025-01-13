package defaultsorting;

import java.util.TreeSet;

public class HotelMainClass {

	public static void main(String[] args) {


		Hotel h1 = new Hotel(5.0, "Mouriya Hotel");
		Hotel h2 = new Hotel(4.3, "National Hotel");
		Hotel h3 = new Hotel(3.5, "Govind Hotel");

		TreeSet<Hotel> t = new TreeSet<Hotel>();
		t.add(h1);
		t.add(h2);
		t.add(h3);

		for (Hotel h : t) {

			System.out.println(h);

		}

	}

}
