public class Tablets extends Medicine {

	public Tablets() {
	}

	public Tablets(String medName, String compName, Date expDate, float medPrice) {
		super(medName, compName, expDate, medPrice);
	}

	public String dispMedInfo() {
		return super.dispMedInfo()+" \n Store at cool and Dry Place";
	}

	
	

	
	
}
