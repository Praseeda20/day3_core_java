	import java.util.Scanner;
public class TestMedDemo {

		public static void main(String[] args)
			{
			Medicine med[]=new Medicine[5];
			Date expDate[] = new Date[10];
			Scanner sc= new Scanner(System.in);
				System.out.println("Enter the Number: ");
				int noOfMed= sc.nextInt();
				
				for(int i=0; i<noOfMed;i++)
				{
					System.out.println("\nChoose the type of medicine: \n1.Tablet \n2.Ointment \n3.Syrup \n ");
					int typeOfMed= sc.nextInt();
					
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
					case 1: med[i]=new Tablets(medName,compName,expDate[i],price);
							System.out.println(" "+med[i].dispMedInfo());
							break;
					case 2:	med[i]=new Ointments(medName,compName,expDate[i],price);
							System.out.println(" "+med[i].dispMedInfo());
							break;
					default: med[i]=new Syrup(medName,compName,expDate[i],price);
							System.out.println(" "+med[i].dispMedInfo());
							break;
					
				}
				
				}
				
					
			}
		}