package _05_ExceptioinHandling;

import java.util.Scanner;

public class _01_ExceptionHandling {
	
	public static void main(String[] args) throws NumberFormatException{
			try{
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter an Integer:");
				int a=sc.nextInt();
//				String str1=sc.nextLine();
//				int str=Integer.parseInt(str1);
//				str=str*str;
				a=a*a;
				System.out.println(a);
				System.out.println("The work has been done successfully ");
				} 
			catch (Exception e) {
				System.out.println(e);
				System.out.println("Entered input is not a valid format for an integer");
				}
			
		}
}
