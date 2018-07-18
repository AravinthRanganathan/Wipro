package _05_ExceptioinHandling;

import java.util.Scanner;
class IrregularMarkException extends Exception {
	 
    public IrregularMarkException (String message) {
        super(message);
    }
}
public class _06_ExceptionHandling {
	void hand(){
		try {
			Scanner sc=new Scanner(System.in);
			int sum=0,avg=0;
			String s1[]=new String[3];
			for(int i=1;i<3;i++) {
				System.out.println("Enter"+i);
				s1[i]=sc.next();
				int m[]=new int[3];
				System.out.println("Enter the marks for student:"+i);
				for(int j=0;j<3;j++) {
					m[j]=sc.nextInt();
					if(m[j]>0) {
						if(m[j]<100) {
							sum+=m[j];
						}
						else {
							throw new IrregularMarkException("Enter the mark between 0-100");
						}
					}
				}
				System.out.println(sum);
				avg+=sum;
			}
			avg=sum/2;
			System.out.println(avg);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws IrregularMarkException {
		_06_ExceptionHandling obj=new _06_ExceptionHandling();
		obj.hand();
	}
}
