package _03_Array;

import java.util.Arrays;

public class Array06 {
	public static void main(String[] args) {
		int arr[]=new int[] {23,45,12,23,45,67,90,67};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
			int ar[]=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
