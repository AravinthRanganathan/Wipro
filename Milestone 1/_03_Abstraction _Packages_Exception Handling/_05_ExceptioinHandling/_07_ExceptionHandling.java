package _05_ExceptioinHandling;

import java.util.Scanner;

class InvalidCountryException extends Exception{
	InvalidCountryException(String userCountry){
		super(userCountry);
	}
}
public class _07_ExceptionHandling{
	
	void registerUser() throws InvalidCountryException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the UserName:");
		String userName=sc.nextLine();
		System.out.println("Enter the UserCountry:");
		String userCountry=sc.nextLine().toLowerCase();
		try {
			if(userCountry.equals("india")) {
				System.out.println("User registration done successfully");
				
			}
			else{
				throw new InvalidCountryException(userName+" is Outside India  cannot be registered");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) throws InvalidCountryException {
	_07_ExceptionHandling obj=new _07_ExceptionHandling();
	obj.registerUser();
	}
}
