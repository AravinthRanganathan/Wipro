package _02_FlowControlAssignment;

import java.util.Scanner;

public class FlowControl18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check whether palindrome or not:");
		int num=sc.nextInt();
		int m=num;
		int a = 0,v;
		while(num>0) {
			v=num%10;
			a=a*10+v;
			num=num/10;
		}
		if(a==m) {
			System.out.println("Given number "+m+" is a palindrome");
		}
		else {
			System.out.println("Given number "+m+" is not a palindrome");
		}
	}
}
