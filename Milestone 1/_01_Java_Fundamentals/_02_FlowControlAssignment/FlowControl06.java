package _02_FlowControlAssignment;

import java.util.Scanner;

public class FlowControl06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Gender");
		String g=sc.nextLine().toLowerCase();
		System.out.println("Enter the age");
		int a=sc.nextInt();
		if((g.equals("female"))&&(a >= 1 || a<=58)){
			System.out.println("Interest==>8.2");
			System.out.println("Gender==>"+g);
			System.out.println("Age==>"+a);
		}
		else if((g.equals("female"))&&(a>=59 || a>=120)) {
			System.out.println("Interest==>7.6");
			System.out.println("Gender==>"+g);
			System.out.println("Age==>"+a);
		}
		else if((g.equals("male"))&&(a>=1 || a>=60)) {
			System.out.println("Interest==>9.2");
			System.out.println("Gender==>"+g);
			System.out.println("Age==>"+a);
		}
		else if ((g.equals("male"))&&(a>=61||a>=120)) {
			System.out.println("Interest==>8.3");
			System.out.println("Gender==>"+g);
			System.out.println("Age==>"+a);
		}		
	}
}