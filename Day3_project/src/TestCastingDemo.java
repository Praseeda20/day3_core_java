public class TestCastingDemo {
	public static void main(String[] args){
		Emp e1=null;
		e1=new Emp(111,"Vaishali",1000.0f);
		WageEmp e2=new WageEmp(222,"Sameer",2000.0f,4,500);
		SalesMgr e3=new SalesMgr(333,"Abhi",3000.0f,6,400,200000);
		Emp e4=new WageEmp(444,"Tripti",4000.0f,5,500);
		Emp e5=new SalesMgr(555,"Nitin",5000.0f,1,300,300000);
		WageEmp e6=new SalesMgr(666,"Teju",6000.0f,6,400,500000);
		
		e2=(WageEmp)e4;
		System.out.println(e2.calcEmpAnnualSal() );
		e2=(WageEmp)e3;
		System.out.println(e2.calcEmpAnnualSal() );
		
		if(e1 instanceof Emp)
		{
			System.out.println("Yes e1 is Emp");
		}
		else
		{
			System.out.println("No e1 is not Emp");
		}
		if(e2 instanceof SalesMgr)
		{
			System.out.println("Yes e2 is SalesMgr");
		}
		else
		{
			System.out.println("No e2 is not SalesMgr");
		}
	}
}
