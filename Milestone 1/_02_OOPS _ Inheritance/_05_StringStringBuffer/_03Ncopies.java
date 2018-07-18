package _05_StringStringBuffer;

import java.util.Scanner;

public class _03Ncopies {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1=sc.next();
		String f ="";
		if(s1.length()>=2) {
			for(int i=0;i<s1.length();i++) {
				f+=s1.substring(0,2);
			}
			System.out.print(f);
		}
		else {
			System.out.println(s1);
		}
	}
}
