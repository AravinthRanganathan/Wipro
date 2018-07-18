package _02_FlowControlAssignment;

import java.util.Scanner;

public class FlowControl07 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Alphabet to be Converted");
		char alpha=sc.next().charAt(0);
		int temp;
		if(alpha>='A'&&alpha<='Z') {
			temp = (int)alpha;
			temp = temp +  32;
			alpha= (char)temp;
			System.out.println("The given Character is Upper case and converted to->"+alpha);
		}
		else if(alpha>='a'&&alpha<='z') {
			temp = (int)alpha;
			temp = temp - 32;
			alpha=(char)temp;
			System.out.println("The given Character is lower case and converted to->"+alpha);
		}
		else {
			System.out.println("Please enter the valid input");
		}
	}
}
