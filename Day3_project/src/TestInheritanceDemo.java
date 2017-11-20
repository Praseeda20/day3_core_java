
public class TestInheritanceDemo {

	public static void main(String[] args) {
		Emp sid=new Emp(111,"Praseeda P", 10000.00f);
		WageEmp sameer=new WageEmp(222,"Sameer K",5000.00f,5,400);
		
		System.out.println(sid.dispEmpInfo());
		System.out.println("Annual Salary of Praseeda: "+sid.calcEmpAnnualSal());
		System.out.println(sameer.dispEmpInfo());
		System.out.println("Annual Salary of Sameer: "+sameer.calcEmpAnnualSal());

		Emp mouli=new WageEmp(333,"Mouli",6000,6,400);
		System.out.println(mouli.dispEmpInfo());
		System.out.println("Annual Salary of Mouli: "+mouli.calcEmpAnnualSal());
		
		SalesMgr deepak=new SalesMgr(444,"Deepak",5000.00f,5,400,200000);
		System.out.println(deepak.dispEmpInfo());
		System.out.println("Annual Salary of Deepak: "+deepak.calcEmpAnnualSal());
		System.out.println(deepak.dispEmpInfo());
	}

}
