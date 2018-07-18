package _03_Inheritance;

class Animal{
	
	void eat() {
		System.out.println("Animal eats");
	}
	void sleep() {
		System.out.println("Animal sleeps");
	}
	
}

public class Bird extends Animal{

	@Override
	void eat() {
		//super.eat();
		System.out.println("Bird Eat");
	}
	
	@Override
	void sleep() {
		//super.sleep();
		System.out.println("Bird sleep");
	}
	
	void fly() {
		System.out.println("Bird fly");
	}
	public static void main(String[] args) {
		Animal obj=new Animal();
		Bird obj1=new Bird();
		obj.eat();
		obj.sleep();
		obj1.eat();
		obj1.sleep();
		obj1.fly();
	}
}

