package _02_FlowControlAssignment;

public class FlowControl03 {

	public static void main(String[] args) {
		if(args.length == 0)
			System.out.println("no values");
		
		for(int i=0;i<args.length;i++) {
			System.out.print(args[i]);
			if(args.length!=i+1) {
				System.out.print(",");
			}
		}	
	}
}
