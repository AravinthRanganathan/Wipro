package _05_StringStringBuffer;

import java.util.Scanner;

public class _02Concatenation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1=sc.next().toLowerCase();
		System.out.println("Enter the second String");
		String s2=sc.next().toLowerCase();
		char last=s1.charAt(s1.length()-1);
		char first=s2.charAt(0);
		String str;
		if(last==first) {
			str=s1.substring(0)+s2.substring(1);
		}
		else {
			str=s1.concat(s2);
		}
		System.out.println("The Final String is "+str);
	}
}
