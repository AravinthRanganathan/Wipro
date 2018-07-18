package _05_StringStringBuffer;

import java.util.Scanner;

public class _06ShortAndLong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1=sc.next();
		System.out.println("Enter the second String");
		String s2=sc.next();
		if(s1.length()>s2.length()) {
			System.out.println(s2+s1+s2);
		}
		else {
			System.out.println(s1+s2+s1);
		}
	}
}
