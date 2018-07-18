package _02_FlowControlAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FlowControl09 {

	public static void main(String[] args) {
		int month=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Month in Number");
		try {
			month=sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Please Enter the month in number");
		}
		
		switch(month) {
		case 1:{
			System.out.println("The Month is January");
			break;
		}
		case 2:{
			System.out.println("The Month is Feb");
			break;
		}
		case 3:{
			System.out.println("The Month is March");
			break;
		}
		case 4:{
			System.out.println("The Month is April");
			break;
		}
		case 5:{
			System.out.println("The Month is May");
			break;
		}
		case 6:{
			System.out.println("The Month is June");
			break;
		}
		case 7:{
			System.out.println("The Month is July");
			break;
		}
		case 8:{
			System.out.println("The Month is August");
			break;
		}
		case 9:{
			System.out.println("The Month is September");
			break;
		}
		case 10:{
			System.out.println("The Month is October");
			break;
		}
		case 11:{
			System.out.println("The Month is November");
			break;
		}
		case 12:{
			System.out.println("The Month is Decemeber");
			break;
		}
		default :{
			if(month>12) 
			System.out.println("Invalid Month");
		}
	  }
   }
}

