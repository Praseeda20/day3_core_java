
public class WageEmp extends Emp {
	int noOfHrs;
	int ratePerHrs;
	public WageEmp()
	{	
		super();
	}
	public WageEmp(int empId, String empName, float empSal, int noOfHrs, int ratePerHrs) 
	{
		super(empId, empName, empSal);	
		this.noOfHrs = noOfHrs;
		this.ratePerHrs = ratePerHrs;
	}
	public float calcEmpAnnualSal(){
		return (super.calcEmpAnnualSal())+(noOfHrs*ratePerHrs*22);
	}

	public String dispEmpInfo() {
		return super.dispEmpInfo()+"\nWageEmp [noOfHrs=" + noOfHrs + ", ratePerHrs=" + ratePerHrs
				+ "]";
	}
	
	
}
