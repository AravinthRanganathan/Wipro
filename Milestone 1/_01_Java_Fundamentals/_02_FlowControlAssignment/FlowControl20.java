package _02_FlowControlAssignment;

import java.util.Scanner;

public class FlowControl20 {
	public static void main(String[] args) {
		char con=' ';
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter the option:\n1.Add\n2.Sub");
			int option=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(option==1) {
				System.out.println("Addition operation selected\n Enter the two number to add:");
				int add=a+b;
				System.out.println("Addition result is:"+add);
			}
			else if(option==2) {
				System.out.println("Subtraction operation selected\n Enter the two number to sub:");
				int sub=a-b;
				System.out.println("Addition result is:"+sub);
			}
			else {
				System.out.println("Invalid Choice");
			}
			System.out.println("If you want to continue");
			con=sc.next().charAt(0);
		}while(con=='y' || con=='Y');
	}
}
