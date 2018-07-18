package _03_Array;

public class Array09 {
	public static void main(String[] args) {
		  int n=0;
		  boolean check=false;
		  int[] nums =new int[] {7,5,8,6,23};
		  for(int i=0;i<nums.length;i++) {
			  if(nums[i]==6) {
				  check=true;
			  }
			  if(check==false) {
				  n+=nums[i];
			  }
			  if(nums[i]==7 && check==true) {
				  if(nums[i]==6) {
					  check=false;
				  }
			  }
		  }
		  System.out.println(n);
	}
}
