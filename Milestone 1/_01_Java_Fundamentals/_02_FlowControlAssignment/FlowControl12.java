package _02_FlowControlAssignment;

import java.util.Scanner;

public class FlowControl12 {

	public static void main(String[] args) {
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int n=num/2;
		if(num==0 || num==1 ) {
			System.out.println(num+" is a prime number");
		}
		else {
			for(int i=2;i<=n;i++){      
			    if(num%2==0){      
			     System.out.println(num+" is not prime number");      
			     flag=1;      
			     break;      
			    }      
			 }   
			if(flag==0) {
				System.out.println(num+" is a prime number");
			}
		}
	}
}
