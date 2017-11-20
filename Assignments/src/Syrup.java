public class Syrup extends Medicine{
	public Syrup() {
	}

	public Syrup(String medName, String compName, Date expDate, float medPrice) {
		super(medName, compName, expDate, medPrice);
	}

	public String dispMedInfo() {
		return super.dispMedInfo()+" \n Shake well before Use";
	}

}
