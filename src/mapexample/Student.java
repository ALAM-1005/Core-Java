package mapexample;

public class Student {


	int age;
	String name;
	public Student(int age, String name) {

		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {

		return "Age:"+age+"  Name:"+name;
	}

}
