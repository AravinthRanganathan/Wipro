package _01_LanguageBasics;

public class CommandLine3 {

	public static void main(String[] args) {
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=a+b;
		System.out.println("The Sum of "+args[0]+" and "+args[1]+" is "+c);
	}
}

