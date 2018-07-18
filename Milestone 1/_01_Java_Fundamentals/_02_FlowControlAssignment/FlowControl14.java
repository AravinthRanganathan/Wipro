package _02_FlowControlAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FlowControl14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0,n=0;
		System.out.println("Enter the number:");
		try {
			n=sc.nextInt();
			for(int i=1;i<n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(n+" is a prime number");
			}
			else if(n==0 || n==1) {
				System.out.println(n+" is neither prime nor composite");
			}
			else {
				System.out.println(n+" is not a prime number");
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter an integer number");
		}
		
	}
}
