package _03_Array;

public class Array11 {
	public static void main(String[] args) {
		int n[]=new int[args.length];
		int n1[][]=new int[3][3];
		int temp =Integer.parseInt(args[0]);
		if(args.length==9) {
			
			for(int i=0;i<args.length;i++) {
				
				n[i]=Integer.parseInt(args[i]);
				
				if(temp<n[i]) {
					temp=n[i];
				}
			}
			int r=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					n1[i][j]=n[r];
					r++;
					System.out.print(n1[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("The Biggest Elements "+temp);
		}
		else {
			System.out.println("Please enter 9 integer numbers");
		}
	}
}
