package _03_Array;

public class Array02 {
	public static void main(String[] args) {
		int[] arr=new int[] {53,30,40,50,86,89};
		int max=arr[0],min=arr[0],temp;
		for(int i=0;i<arr.length-1;i++) {
			if(max<arr[i+1]) {
				max=arr[i+1];
			}
			if(min>arr[i+1]) {
				min=arr[i+1];
			}
		}
		System.out.println("Maximum value in thr array:"+max);
		System.out.println("Minimum value in thr array:"+min);
	}
}
