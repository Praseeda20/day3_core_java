
public class TestAllEmpArrayDemo {
	public static void main(String[] args){
		Emp emps[]=new Emp[6];
		emps[0]=new Emp(111,"Vaishali",1000.0f);
		emps[1]=new WageEmp(222,"Sameer",2000.0f,3,300);
		emps[2]=new SalesMgr(333,"Tripti",1000.0f,3,300,600000);
		emps[3]=new Emp(444,"Teju",78000.0f);
		emps[4]=new WageEmp(555,"Deepak",45000.0f,4,400);
		emps[5]=new SalesMgr(666,"Kanika",68000.0f,3,400,400000);
		
		for(int i=0; i<emps.length;i++)
		{
			if(emps[i] instanceof SalesMgr)
			{
				System.out.println("Employee is a Sales Manager");
				System.out.println(i+"th employee Info:"+ emps[i].dispEmpInfo());
				System.out.println("Annual salary:" +emps[i].calcEmpAnnualSal()+"\n");
			}
			else if(emps[i] instanceof WageEmp)
			{
				System.out.println("Employee is a Wage Employee");
				System.out.println(i+"th employee Info:"+ emps[i].dispEmpInfo());
				System.out.println("Annual salary:" +emps[i].calcEmpAnnualSal()+"\n");
			}
			else 
			{
				System.out.println("Employee is a permanent Employee");
				System.out.println(i+"th employee Info:"+ emps[i].dispEmpInfo());
				System.out.println("Annual salary:" +emps[i].calcEmpAnnualSal()+"\n");
			}
		}
	}
}
