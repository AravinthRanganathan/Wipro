package _01_Wrapper_Classes;

public class Employee implements Cloneable{
	int regnumber;
	String name;
	Employee(int reg,String name){
		this.regnumber=reg;
		this.name=name;
	}
	public Object Clone()throws CloneNotSupportedException{
		return super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		try {
			Employee s1=new Employee(18,"Aravinth");
			Employee s2=(Employee)s1.clone();
			s1.name="Arjhun";
			s1.regnumber=12;
			
			System.out.println(s1.regnumber+" "+s1.name);  
			System.out.println(s2.regnumber+" "+s2.name);
		}
		catch( CloneNotSupportedException e) {
			System.out.println(e);
		}
	}
}
