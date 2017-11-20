public class Emp {
	private int empId;
	private String empName;
	private float empSal;
	
		public Emp()
		{  }
		
		public Emp(int empId, String empName, float empSal)
		{
			this.empId=empId;
			this.empName=empName;
			this.empSal=empSal;
	
		}
		public String dispEmpInfo()
		{
			return "\nEmp [empId= "+empId+", empName= "+empName+", Basic EmpSal= "+empSal+" ] ";
		}
		
		public float calcEmpAnnualSal()
		{
			return empSal*12;
		}
}


