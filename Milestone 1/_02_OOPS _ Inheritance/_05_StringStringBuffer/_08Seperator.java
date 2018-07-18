package _05_StringStringBuffer;

import java.util.Scanner;

public class _08Seperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String1:");
		String str1=sc.nextLine();
		System.out.println("Enter the String2:");
		String str2=sc.nextLine();
		System.out.println("Enter the occurance :");
		int occ=sc.nextInt();
		String s1,s2;
		if(str1.length()>str2.length()) {
			s1=str1;
			s2=str2;
		}
		else {
			s1=str2;
			s2=str1;
		}
			for(int i=0;i<occ;i++) {
				if(occ-1>i) {
				
					System.out.print(s1+s2);
				}
				else {
					System.out.print(s1);
				}
			}
	}
}
