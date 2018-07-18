package _03_Array;

public class Array01 {
	public static void main(String[] args) {
		int arr[]=new int[] {20,10,50,46,23,89};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=arr[0]+arr[1];	
		}
		System.out.println("The Sum is "+sum);
		int avg=sum/arr.length;
		System.out.println("The Average is "+avg);
	}
}
