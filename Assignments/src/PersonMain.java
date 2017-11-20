public class PersonMain {

	public static void main(String[] args) {
		Person details= new Person("Praseeda", "Prasannan", Gender.F, 9876543210L);
		
		System.out.println(" " + details.dispDetails());
	}

}