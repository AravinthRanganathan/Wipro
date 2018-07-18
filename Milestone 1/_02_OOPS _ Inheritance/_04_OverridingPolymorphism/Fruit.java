package _04_OverridingPolymorphism;

public class Fruit {

	String name;
	String taste;
	int size;
	void eat(String name,String taste){
		this.name=name;
		this.taste=taste;
	}
	public static void main(String[] args) {
		Apple obj1=new Apple("Apple","sweet",20);
		Orange obj2=new Orange("Orange","Bitters",30);
		System.out.println("Name\t taste \t size");
		System.out.println(obj1.name+"\t"+obj1.taste+"\t"+obj1.size);
		System.out.println("========================");
		System.out.println("Name \t taste \t size");
		System.out.println(obj2.name+"\t"+obj2.taste+"\t"+obj2.size);
	}
	
}
class Apple extends Fruit{
	Apple(){
		
	}
	Apple(String name,String taste,int size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	@Override
	void eat(String name, String taste) {
		super.eat(name, taste);
	}
}
class Orange extends Fruit{
	Orange(){
		
	}
	Orange(String name,String taste,int size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	@Override
	void eat(String name, String taste) {
		super.eat(name, taste);
	}
}


