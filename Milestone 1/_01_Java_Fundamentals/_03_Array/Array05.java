package _03_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the values:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println(arr[0]+" "+arr[1]);
		System.out.println(arr[arr.length-2]+" "+arr[arr.length-1]);
	}
}
