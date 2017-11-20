 enum Gender{M,F};
public class Person {
	private String firstName;
	private String lastName;
	Gender gender;
	private long phoneNo;	
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Person(String firstName, String lastName, Gender gender, long phoneNo) {
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
