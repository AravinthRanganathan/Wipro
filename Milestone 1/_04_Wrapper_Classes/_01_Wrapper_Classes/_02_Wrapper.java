package _01_Wrapper_Classes;

public class _02_Wrapper {

	public static void main(String[] args) {
		System.out.println("Given Number :"+args[0]);
		int a=Integer.parseInt(args[0]);
		System.out.println("Binary equivalent:"+Integer.toBinaryString(a));
		System.out.println("Octal equivalent:"+Integer.toOctalString(a));
		System.out.println("Hexa equivalent:"+Integer.toHexString(a));
	}
}
