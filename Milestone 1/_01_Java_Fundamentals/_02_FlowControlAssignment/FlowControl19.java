package _02_FlowControlAssignment;

import java.util.Scanner;

public class FlowControl19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=1,count=0;
		while(count<5) {
			if(a%2==0 && a%3==0 && a%5==0) {
				System.out.println(a);
				count++;
			}
			a++;
		}
		
	}
}
