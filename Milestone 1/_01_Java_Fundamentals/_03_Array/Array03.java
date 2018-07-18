package _03_Array;

import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {
		int arr[]=new int[] {1,4,34,56,7};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int count=-1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==a) {
				count=i+1;
			}
		}
		System.out.println(count);
	}
}
