package _02_Assert_Method_Annotation;

public class MyUnit {
	 boolean palindromeCheck(String s1) {
		 StringBuilder sb=new StringBuilder(s1);
		 sb.reverse();
		 String s2=sb.toString();
		 if(s1.equals(s2)) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	public static void main(String[] args) {
		MyUnit obj=new MyUnit();
		System.out.println(obj.palindromeCheck("madam"));
		System.out.println(obj.palindromeCheck("madm"));
	}
}
