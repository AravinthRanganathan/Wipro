package _05_StringStringBuffer;

import java.util.Scanner;

public class _12LastNRepeat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		System.out.println("Enter the occurance:");
		int occ=sc.nextInt();
		String s=str.substring(str.length()-occ);
		for(int i=0;i<occ;i++) {
			System.out.print(s);
		}
	}
}
