package lab;

import java.util.Scanner;

public class TestStringDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str1=sc.nextLine();
		// str1+=sc.nextLine();
		System.out.println("Enter operation to be performed on the string: ");
		int num=sc.nextInt();
		StringDemo sd=new StringDemo();
		switch(num){
		case 1: sd.addString(str1);
			break;
		case 2: sd.replaceOddPos(str1);
			break;
		//case 3: sd.removeDupChars(str);
			//break;
		case 3: sd.changeOddUpper(str1);
			break;
		default: System.out.println("Invalid input");		
		}
		//System.out.println(str);
		sc.close();
	}

}
