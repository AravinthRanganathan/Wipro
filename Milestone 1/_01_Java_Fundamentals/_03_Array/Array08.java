package _03_Array;

import java.util.Scanner;

public class Array08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the values:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int max=0,val=0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(max<count) {
				max=count;
				val=arr[i];
			}
		}
		System.out.println(val);
	}
}
