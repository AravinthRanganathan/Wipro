package _03_Array;

public class Array04 {
	public static void main(String[] args) {
		int[] arr=new int[]{65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123};
		for(int a=0;a<26;a++) {
		System.out.print((char)arr[a]);
	}
		System.out.println();
		for(int a=26;a<52;a++) {
			System.out.print((char)arr[a]);
		}
	}
}
