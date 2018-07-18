package _01_ClassesAndObjects;

public class Box {
	double volume(double width,double height,double depth){
		return width*height*depth;
		
	}
	public static void main(String[] args) {
		Box obj=new Box();
		double volume=obj.volume(5,5,3);
		System.out.println("The volume of the Box is "+volume);
	}
}
