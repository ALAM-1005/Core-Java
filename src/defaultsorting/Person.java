package defaultsorting;

public class Person implements Comparable<Person>{
	int age;
	String name;
	public Person(int age, String name) {

		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {

		return name+"is "+age+" Years old.";
	}
	@Override
	public int compareTo(Person p) {	
		return this.name .compareTo(p.name);
	}
}


//for string comparison ,we should call compareTo() of String  class
