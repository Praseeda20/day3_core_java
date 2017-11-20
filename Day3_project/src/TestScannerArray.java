import java.util.Scanner;
public class TestScannerArray{
	static Emp emps[]=new Emp[2];
	private static Scanner sc;
	public static void main(String[] args){
		int typeofEmp;
		sc = new Scanner(System.in);	
		for(int i=0; i<emps.length;i++)
		{
			System.out.println("Enter the type of employee: \n1. permanent Employee\n2.Wage Employee\n3.Sales Manager\n");
			typeofEmp = sc.nextInt();
			switch(typeofEmp){
			case 1:permntEmpl();
				    break;
			case 2:wageEmp();
			   		break;
			case 3:salesMgr();
			   		break;
			default:System.out.println("Invalid input");
					break;
			}
		}
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
public static void permntEmpl()
{
	for(int i=0; i<emps.length;i++)
	{
		System.out.println("Enter employeeID: ");
		int eid = sc.nextInt();
		
		System.out.println("Enter employee name: ");
		String ename = sc.next();
		
		System.out.println("Enter employee salary: ");
		float empsal = sc.nextFloat();
		
		emps[i]=new Emp(eid, ename, empsal);
	}
}
public static void wageEmp()
{
	for(int i=0; i<emps.length;i++)
	{
		
		System.out.println("Enter employeeID: ");
		int eid = sc.nextInt();
		
		System.out.println("Enter employee name: ");
		String ename = sc.next();
		
		System.out.println("Enter employee salary: ");
		float empsal = sc.nextFloat();
		
		System.out.println("Enter No.of Hours worked: ");
		int noOfHrs = sc.nextInt();
		
		System.out.println("Enter Rate per Hour: ");
		int ratePerHr = sc.nextInt();
		
		emps[i]=new WageEmp( eid, ename, empsal, noOfHrs, ratePerHr);
	}
	
}
public static void salesMgr()
{
	for(int i=0; i<emps.length;i++)
	{
		System.out.println("Enter employeeID: ");
		int eid = sc.nextInt();
		
		System.out.println("Enter employee name: ");
		String ename = sc.next();
		
		System.out.println("Enter employee salary: ");
		float empsal = sc.nextFloat();
		
		System.out.println("Enter No.of Hours worked: ");
		int noOfHrs = sc.nextInt();
		
		System.out.println("Enter Rate per Hour: ");
		int ratePerHr = sc.nextInt();
		
		System.out.println("Enter Sales: ");
		int sales = sc.nextInt();
		
		
		emps[i]=new SalesMgr(eid, ename, empsal,noOfHrs,ratePerHr,sales);
	}
}
}