
public class Ointment extends Medicine{

	public Ointment() {
	}

	public Ointment(String medName, String compName, Date expDate, float medPrice) {
		super(medName, compName, expDate, medPrice);
	}

	public String dispMedInfo() {
		return super.dispMedInfo()+" \n For External Use only";
	}

}
