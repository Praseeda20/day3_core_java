
public class Person {
	private String firstName;
	private String lastName;
	char gender;
	private long phoneNo;	
	
	public Person(String firstName, String lastName, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	public Person(String firstName, String lastName, char gender, long phoneNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNo = phoneNo;
	}


	public Person() {
		
	}


	public String dispDetails() {
		return "Person Details:\n-----------------------\nFirst Name:" + firstName + "\nLast Name:" + lastName
				+ "\nGender:" + gender+ "\nPhone Number:" + phoneNo;
	}		
}


