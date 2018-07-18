package _05_StringStringBuffer;

import java.util.Scanner;

public class _09Star {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		String hi="";
		if(str.contains("*")) {
			for(int i=0;i<str.length()-1;i++) {
				if(str.charAt(i)=='*' && Character.isAlphabetic(str.charAt(i-1))) {
					hi+=str.substring(0,i-1);
				}
				if(str.charAt(i)=='*'&&(Character.isAlphabetic(str.charAt(i+1)))) {
					hi+=str.substring(i+2);
				}
//				if((Character.isAlphabetic(str.charAt(i-1)))&&str.charAt(i)=='*'&&(Character.isAlphabetic(str.charAt(i+1)))) {
//					hi=str.substring(0,i-1)+str.substring(i+2);
//				}
			}
		}
		System.out.println(hi);
	}
}
