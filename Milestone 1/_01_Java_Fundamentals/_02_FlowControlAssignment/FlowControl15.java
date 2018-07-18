package _02_FlowControlAssignment;

import java.util.Scanner;

public class FlowControl15 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		while(n!=0) {
			sum+=n%10;
			n=n/10;
		}
		System.out.println("sum is "+sum);
	}
}
