
public class Number_check {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter a Number: ");
		num=Integer.parseInt(args[0]);
		if(num<0)
			System.out.println("The entered number "+num+" is negative.");
		else
			System.out.println("The entered number "+num+" is positive.");
	}

}
