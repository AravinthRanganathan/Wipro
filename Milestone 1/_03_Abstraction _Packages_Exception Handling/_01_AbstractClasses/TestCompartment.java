package _01_AbstractClasses;

abstract class Compartment{
	abstract void notice();
}
//FirstClass, Ladies, General, Luggage 
class FirstClass extends Compartment{

	@Override
	void notice() {
		System.out.println("This is FirstClass");
	}
	
}
class Ladies extends Compartment{

	@Override
	void notice() {
		System.out.println("This is Ladies compartment");
	}
	
}
class General extends Compartment{

	@Override
	void notice() {
		System.out.println("This is General Class");
	}
	
}
class Luggage extends Compartment{

	@Override
	void notice() {
		System.out.println("This is Luggage");
	}
	
}
public class TestCompartment {
	public static void main(String[] args) {
		Compartment[] obj=new Compartment[10];
		int rand=(int)(Math.random()*4);
		switch(rand) {
		case 1:
		{
			obj[1]=new FirstClass();
			obj[1].notice();
			break;
		}
		case 2:
		{
			obj[2]=new Ladies();
			obj[2].notice();
			break;
		}
		case 3:
		{
			obj[3]=new General();
			obj[3].notice();
			break;
		}
		case 4:
		{
			obj[4]=new Luggage();
			obj[4].notice();
		 }
		}
	}

}
