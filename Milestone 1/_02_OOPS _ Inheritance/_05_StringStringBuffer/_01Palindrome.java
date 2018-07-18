package _05_StringStringBuffer;

import java.util.Scanner;

public class _01Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to check :");
		String s1=sc.next().toLowerCase();
		StringBuilder sb=new StringBuilder(s1);
		sb.reverse();
		String s2=sb.toString();
		if(s1.equals(s2)) {
			System.out.println("Given String is a Palindrome");
		}
		else {
			System.out.println("Given String is not a Palindrome");
		}
	}
}
