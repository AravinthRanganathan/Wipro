package _01_ClassesAndObjects;

class Patient{
	String name;
	double weight,height;
	Patient(){
		
	}
	Patient(String name,double weight,double height){
		this.name=name;
		this.weight=weight;
		this.height=height;
	}
	double BMI(){
		return (weight/(height*height))*703;
		
	}
}
public class Patients {

	public static void main(String[] args) {
		 Patient obj=new Patient();
		 obj.name="Aravinth";
		 obj.height=71;
		 obj.weight=185;
		 System.out.println("The BMI of "+obj.name+" is "+obj.BMI());
	}
}
