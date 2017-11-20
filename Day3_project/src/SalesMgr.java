
public class SalesMgr extends WageEmp {
	int sales;
	float comm=0.02f;
	public SalesMgr() {
		super();
	}
	public SalesMgr(int empId, String empName, float empSal, int noOfHrs,
			int ratePerHrs, int sales) {
		super(empId, empName, empSal, noOfHrs, ratePerHrs);
		this.sales = sales;
				
	}
	
	public float calcEmpAnnualSal(){
		return (super.calcEmpAnnualSal())+(sales*comm);
	}

	public String dispEmpInfo() {
		return super.dispEmpInfo()+"\nSalesMgr [sales=" + sales + ", comm=" + comm + "]";
	}

}
