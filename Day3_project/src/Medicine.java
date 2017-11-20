
public class Medicine {
	private String medName;
	private String compName;
	private Date expDate;
	private float medPrice;
	public Medicine() {
}
	public Medicine(String medName, String compName, Date expDate,
			float medPrice) {
		this.medName = medName;
		this.compName = compName;
		this.expDate = expDate;
		this.medPrice = medPrice;
	}

	public String dispMedInfo() {
		return "Medicine [medName=" + medName + ", compName=" + compName
				+ ", expDate=" + expDate.dispDate() + ", medPrice=" + medPrice + "]";
	}

	
	
}
