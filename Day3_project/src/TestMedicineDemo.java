import java.util.Scanner;

public class TestMedicineDemo {
	
	public static void main(String[] args)
		{
		Medicine med[]=new Medicine[2];
		Date expDate[] = new Date[10];
		Scanner sc= new Scanner(System.in);
		Medicine tabletObj=new Tablet();
		Medicine ointmentObj=new Ointment();
		Medicine syrupObj=new Syrup();
			System.out.println("Choose the type of medicine: \n1.Tablet \n2.Ointment \n3.Syrup \n ");
			int typeOfMed= sc.nextInt();
			for(int i=0; i<med.length;i++)
			{
				System.out.println("Enter Medicine Name: ");
				String medName = sc.next();
				
				System.out.println("Enter Company Name: ");
				String compName = sc.next();
				
				System.out.println("Enter Price: ");
				float price = sc.nextFloat();
				
				System.out.println("Enter Expiry Date: ");
				int day=sc.nextInt();
				int mon=sc.nextInt();
				int year=sc.nextInt();
				
				expDate[i]=new Date(day, mon, year);
				switch(typeOfMed){
				case 1: med[i]=new Tablet(medName,compName,expDate[i],price);
						break;
				case 2:	med[i]=new Ointment(medName,compName,expDate[i],price);
						break;
				default: med[i]=new Syrup(medName,compName,expDate[i],price);
						break;
				
			}
			
			}
			for(int i=0;i<med.length;i++)
			{
				System.out.println(" "+med[i].dispMedInfo());
			}
			
		}
	}