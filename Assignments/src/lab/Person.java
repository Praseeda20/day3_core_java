package lab;

public class Person {
	private String firstName;
	private String lastName;
	private char gender;
	private int age;
	private float weight;

	public Person() {
		super();
	}

	public Person(String firstName, String lastName, char gender, int age,
			float weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}
	public String dispDetails() {
		return "\nPerson Details\n-------------------\n\nFirst Name: " + firstName + "\nLast Name: " + lastName
				+ "\nGender: " + gender + "\nAge: " + age + "\nWeight: " + weight
				+ "";
	}

}
