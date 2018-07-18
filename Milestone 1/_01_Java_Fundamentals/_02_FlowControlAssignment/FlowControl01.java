package _02_FlowControlAssignment;

import java.util.Scanner;

public class FlowControl01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to Check");
		int i=sc.nextInt();
		if(i>0) {
			System.out.println("The given number is positive");
		}
		else if(i<0){
			System.out.println("The Given Number is Negative");
		}
		else {
			System.out.println("The Given Number is zero ");
		}
	}
}

