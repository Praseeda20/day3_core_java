public class Person {
	private String firstName;
	private String lastName;
	char gender;
	
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public Person(String firstName, String lastName, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}


	public Person() {
		
	}


	public String dispDetails() {
		return "Person Details:\n-----------------------\nFirst Name:" + firstName + "\nLast Name:" + lastName
				+ "\nGender:" + gender;
	}		
}



