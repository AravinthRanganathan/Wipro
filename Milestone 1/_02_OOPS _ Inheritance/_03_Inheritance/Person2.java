package _03_Inheritance;

public class Person2 {

	String name;
	public static void main(String[] args) {
		CollegeStudent cs=new CollegeStudent();
		Teacher t=new Teacher();
		cs.name="Aravinth";
		cs.reg=1513010;
		cs.instution="KSR";
		cs.major="CSE";
		cs.year=2015;
		t.name="Teacher";
		t.salary=50000;
		t.subject="Chemistry";
		System.out.println("------Teacher Details------");
		System.out.println("Name \t Salary \t Subject");
		System.out.println(t.name+"\t"+t.salary+"\t"+t.subject);
		System.out.println("\n---------------------------\n");
		System.out.println("--------College Student Details------");
		System.out.println("Name \t Reg \t Instution \t Major");
		System.out.println(cs.name+cs.reg+"\t"+cs.instution+"\t"+cs.major+"\t"+cs.year);
	}
}
class Student extends Person2{
	int reg;
	String instution;
}
class Teacher extends Person2{
	int salary;
	String subject;
}
class CollegeStudent extends Student{
	int year;
	String major;
}


