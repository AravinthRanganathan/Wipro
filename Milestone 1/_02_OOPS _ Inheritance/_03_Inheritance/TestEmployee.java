package _03_Inheritance;

class Person{
	String name;
	Person(String a){
		name=a;
	}
}
class Employee extends Person {
	
	Employee(String a) {
		super(a);
	}
	double annualSalary;
	String year;
	String national_insurance_number;
	
	
}
public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e = new Employee("Aravinth");
		e.annualSalary=20000;
		e.year="20/12/1997";
		e.national_insurance_number="E12C52";
		System.out.println(e.name);
		System.out.println("The Annual Salary "+e.annualSalary);
		System.out.println("the year "+e.year);
		System.out.println("national_insurance_number "+e.national_insurance_number);
	}
	
}

