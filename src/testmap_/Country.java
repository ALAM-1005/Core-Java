package testmap_;

public class Country implements Comparable<Country> {

	int pinCode;
	String population;

	public Country(int pinCode, String population) {
		super();
		this.pinCode = pinCode;
		this.population = population;
	}

	@Override
	public String toString() {
		return "Country [pinCode=" + pinCode + ", population=" + population +  "]";
	}

	@Override
	public int compareTo(Country key) {
		// TODO Auto-generated method stub
		return this.population.compareTo(key.population);
	}

	
}
