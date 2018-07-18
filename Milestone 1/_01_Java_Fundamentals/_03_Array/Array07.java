package _03_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the values:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!(a.contains(arr[i]))) {
				a.add(arr[i]);
			}
		}
		System.out.println(a);
	}
}
