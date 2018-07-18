package _02_FlowControlAssignment;

import java.util.Scanner;

public class FlowControl05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter to find:");
		char i= sc.next().charAt(0);
		if((i>='a'&&i<='z')||(i>='A'&&i<='Z')){
			System.out.println("The Given is Alphabet");
		}
		else if(i>=48&&i<=57) {
			System.out.println("The Given is Digit");
		}
		else {
			System.out.println("The Given is special charater ");
		}
	}
}
