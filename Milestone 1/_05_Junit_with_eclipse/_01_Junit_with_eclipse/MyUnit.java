package _01_Junit_with_eclipse;

public class MyUnit {
	String stringconcat(String s1,String s2) {
		return s1+s2;
	}
	public static void main(String[] args) {
		MyUnit obj=new MyUnit();
		System.out.println(obj.stringconcat("Aravinth ", "Ranganathan"));
		System.out.println(obj.stringconcat("Mahi ", "Msdian"));
	}
}
