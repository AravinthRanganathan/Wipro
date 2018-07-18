package _05_StringStringBuffer;

import java.util.Scanner;

public class _05FirstAndLastChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		if(str.length()>2) {
			String s=str.substring(1,str.length()-1);
			System.out.println(s);
		}
	}
}
