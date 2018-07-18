package _05_StringStringBuffer;

import java.util.Scanner;

public class _13BeforAfterXY {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		String hi="";
			for(int i=0;i<str.length()-1;i++) {
				if(i!=0 && str.substring(i,i+2).equals("XY")) {
					hi+=str.substring(i-1,i);
				}
				if((i!=str.length()-1 && str.substring(i,i+2).equals("XY"))) {
					hi+=str.substring(i+2,i+3);
				}
			}
		System.out.println(hi);
	}
}
