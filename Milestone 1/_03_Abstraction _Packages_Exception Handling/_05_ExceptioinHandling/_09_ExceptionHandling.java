package _05_ExceptioinHandling;

import java.util.Scanner;

public class _09_ExceptionHandling {

	static void division() throws ArithmeticException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Value:");
		int a=sc.nextInt();
		System.out.println("Enter the second value:");
		int b=sc.nextInt();
		int d=a/b;
		System.out.println("The quotient of "+a+"/"+b+"="+d);
	}
	public static void main(String[] args) {
		
		try {
			division();
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("\nInside finally block");
		}
	}
}
