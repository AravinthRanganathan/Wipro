package _05_StringStringBuffer;

import java.util.Scanner;

public class _10MixExtra {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String1:");
		String str1=sc.nextLine();
		System.out.println("Enter the String2:");
		String str2=sc.nextLine();
		String mix="";
		if(str1.length()>str2.length()) {
			for(int i=0;i<=str2.length()-1;i++) {
				mix+=str1.substring(i,i+1)+str2.substring(i,i+1);
			}
			mix+=str1.substring(str2.length());
		}
		if(str1.length()<str2.length()) {
			for(int i=0;i<=str1.length()-1;i++) {
				mix+=str1.substring(i,i+1)+str2.substring(i,i+1);
			}
			mix+=str2.substring(str1.length());
		}
		if(str1.length()==str2.length()) {
			for(int i=0;i<=str2.length()-1;i++) {
				mix+=str1.substring(i,i+1)+str2.substring(i,i+1);
			}
		}
		System.out.println(mix);
	}
}
