package _05_ExceptioinHandling;

import java.util.Scanner;

public class _04_ExceptionHandling{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws ArithmeticException,NumberFormatException,Exception{
		try {
			int sum=0,avg=0;
			int arr[]=new int[args.length];
			for(int i=0;i<args.length;i++) {
				arr[i]=Integer.parseInt(args[i]);
				sum+=arr[i];
			}
			avg=sum/arr.length;
			System.out.println("Sum:"+sum);
			System.out.println("Avg:"+avg);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(NumberFormatException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}