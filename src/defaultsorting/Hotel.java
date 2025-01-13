package defaultsorting;

public class Hotel implements Comparable<Hotel> {

	Double Rating;
	String name;
	
	
	public Hotel(Double Rating, String name) {
		this.Rating = Rating;
		this.name = name;
	}

	@Override

	public String toString() {

		return name+" rating is "+Rating;
	}

	@Override

	public int compareTo(Hotel h) {

		return this.Rating.compareTo(h.Rating);
	}

}
