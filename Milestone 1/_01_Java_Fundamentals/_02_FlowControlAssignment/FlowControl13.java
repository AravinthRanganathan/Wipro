package _02_FlowControlAssignment;

public class FlowControl13 {
	public static void main(String[] args) {
		int arr[]=new int[56];
		int k=0;
		for(int n=11;n<=37;n++) {
			int count=0;
			for(int i=1;i<n;i++) {
				
				if(n%i==0) {
					count++;
				}
			}
			if(count==1) {
				arr[k]=n;
				System.out.print(n+" ");
				k++;
			}
		}
		for( k=1;k<50;k++) {
			System.out.println();
			System.out.println(arr[k]);
		}
	}
}
