package _02_FlowControlAssignment;

public class FlowControl11 {

	public static void main(String[] args) {
		for(int i=23;i<54;i++) {
			int j=i%2;
			if(j==0) {
				System.out.println("Numbers of Even\t"+i);	
			}
		}
	}
}
