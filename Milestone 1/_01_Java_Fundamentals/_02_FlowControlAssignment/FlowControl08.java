package _02_FlowControlAssignment;

import java.util.Scanner;

public class FlowControl08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the color code");
		String ch=sc.nextLine().toLowerCase();
		switch(ch) {
		case "r":{
			System.out.println("The colour is Red");
			break;
		}
		case "b":{
			System.out.println("The colour is Blue");
			break;
		}
		case "g":{
			System.out.println("The colour is Green");
			break;
		}
		case "o":{
			System.out.println("The colour is Orange");
			break;
		}
		case "y":{
			System.out.println("The colour is Yellow");
			break;
		}
		case "w":{
			System.out.println("The colour is White");
			break;
		}
		default:
			System.out.println("Invalid code");
		}
 }
}
