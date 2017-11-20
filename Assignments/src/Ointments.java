
public class Ointments extends Medicine{

	public Ointments() {
	}

	public Ointments(String medName, String compName, Date expDate, float medPrice) {
		super(medName, compName, expDate, medPrice);
	}

	public String dispMedInfo() {
		return super.dispMedInfo()+" \n For External Use only";
	}

}