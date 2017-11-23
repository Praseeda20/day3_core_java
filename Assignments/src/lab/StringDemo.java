package lab;

public class StringDemo {
	private String str;

	public StringDemo() {
	}

	public StringDemo(String str) {
		this.str = str;
	}

	public String addString(String str) {
		str=str.concat(str);
		System.out.println(str);
		return str;
	}

	public String replaceOddPos(String str) {
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
				System.out.print("#");
			}
			else
			{
				char oddStr=str.charAt(i);
				System.out.print(oddStr);
			}
		}	
		
		return str;
	}

	//public String removeDupChars(String str) {
		// for
	//}

	public String changeOddUpper(String str) {
		for(int i=0;i<str.length();i++)
		{
			char oddStr=str.charAt(i);
			if(i%2==0)
			{
				System.out.print(Character.toUpperCase(oddStr));
			}
			else
			{
				System.out.print(str.charAt(i));
			}
		}	
		return str;
	}

}
