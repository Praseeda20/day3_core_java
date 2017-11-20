
public class Tablet extends Medicine {

	public Tablet() {
	}

	public Tablet(String medName, String compName, Date expDate, float medPrice) {
		super(medName, compName, expDate, medPrice);
	}

	public String dispMedInfo() {
		return super.dispMedInfo()+" \n Store at cool and Dry Place";
	}

	
	

	
	
}
