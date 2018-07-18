package _05_ExceptioinHandling;

import java.util.Scanner;

class AgeRestrictionException extends Exception{
	AgeRestrictionException(String age) {
		super(age);
	}
}
public class _08_ExceptionHandling {
	
	public static void main(String[] args) throws AgeRestrictionException {
		try {
			Scanner sc=new Scanner(System.in);
			int age=0;
			age=Integer.parseInt(args[1]);
			if(age>=18 && age<60) {
				System.out.println("Username:"+args[0]);
				System.out.println("Age:"+args[1]);
			}
			else {
				throw new AgeRestrictionException("Age must be between 18 and 60");
			}
			
		}
		catch(AgeRestrictionException e) {
			System.out.println(e);
		}
	}
}
