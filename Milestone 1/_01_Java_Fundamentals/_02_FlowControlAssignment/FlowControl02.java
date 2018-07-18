package _02_FlowControlAssignment;

import java.util.Scanner;

public class FlowControl02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check Whether ODD or EVEN");
		int oe =sc.nextInt();
		int d = oe%2;
		if(d == 0) {
			System.out.println("The Given Number Is Even");
		}
		else {
			System.out.println("The Given Number Is odd");
		}
	}
}
