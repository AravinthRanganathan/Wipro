package _05_StringStringBuffer;

import java.util.Scanner;

public class _07FirstLastX {
	public String cs(String str) {
		String s = "";
		if(str.toUpperCase().charAt(0)=='X' && str.toUpperCase().charAt(str.length()-1)=='X') {
			s=str.substring(1,str.length()-1);
			return s;
		}
		if(str.toUpperCase().charAt(0)=='X') {
			s=str.substring(1,str.length());
			return s;
		}
		if(str.toUpperCase().charAt(str.length()-1)=='X') {
			s=str.substring(0,str.length()-1);
			return s;
		}
		return str;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		_07FirstLastX obj=new _07FirstLastX();
		System.out.println(obj.cs(str));
	}
}
