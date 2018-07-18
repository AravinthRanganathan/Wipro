package _03_Array;

public class Array10 {
	public static void main(String[] args) {
		int n[]=new int[args.length];
		int n1[][]=new int[2][2];
		if(args.length==4) {
			for(int i=0;i<4;i++) {
				n[i]=Integer.parseInt(args[i]);
			}
			int r=0;
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					n1[i][j]=n[r];
					r++;
					System.out.print(n1[i][j]+" ");
				}
				System.out.println();
			}
			 r=1;
			 System.out.println("Reversed Array");
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					n1[i][j]=n[n.length-r];
					r++;
					System.out.print(n1[i][j]+" ");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Please enter 4 integer numbers");
		}
		
	}
}
