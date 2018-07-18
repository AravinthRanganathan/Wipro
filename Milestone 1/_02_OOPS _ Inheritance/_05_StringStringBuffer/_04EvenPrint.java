package _05_StringStringBuffer;

import java.util.Scanner;

public class _04EvenPrint {
	public String store(String str) {
		if(str.length()%2==0) {
			str=str.substring(0,str.length()/2);
			return str;
		}else {
			return null;
		}
	}
	public static void main(String[] args) {
		_04EvenPrint obj=new _04EvenPrint();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		System.out.println(obj.store(str));
	}
}
