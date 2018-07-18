package _02_FlowControlAssignment;

import java.util.Scanner;

public class FlowControl17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to reverse:");
		int num=sc.nextInt();
		while(num!=0) {
			int n=num%10;
			num=num/10;
			System.out.print(n);
		}
	}
}
