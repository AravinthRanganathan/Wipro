package _02_FlowControlAssignment;

import java.util.Scanner;

public class FlowControl04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphabet");
		String scObj=sc.nextLine();
		String sc1Obj=sc.nextLine();
		int r1=scObj.compareTo(sc1Obj);
		int r2=sc1Obj.compareTo(scObj);
		//System.out.println(r1);
		//System.out.println(r2);
		if(r1<r2) {
			System.out.println(scObj+" "+sc1Obj);
		}
		else {
			System.out.println(sc1Obj+" "+scObj);
		}
	}
}
