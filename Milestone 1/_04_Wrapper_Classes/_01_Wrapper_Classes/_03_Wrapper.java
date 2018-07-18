package _01_Wrapper_Classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Formatter;

public class _03_Wrapper {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		if(a>=1&&a<=255) {
			System.out.println(a);
			String str=Integer.toBinaryString(a);
			System.out.println("Binary Converted value :"+str);
//			for(int i=8;i>str.length();i--) {
//				System.out.print("0");
//			}
//			System.out.print(str);
			str=String.format("%8s",str);
			Pattern ptn = Pattern.compile("\\s");
			Matcher m = ptn.matcher(str);
			System.out.println(m.replaceAll("0"));
		}
	}
}
