package _04_Interfaces;

public class LibraryInterfaceDemo {
	public static void main(String[] args) {
		KidUsers kid=new KidUsers();
		AdultUser adu=new AdultUser();
		kid.age=10;
		kid.bookType="Kids";
		adu.age=18;
		adu.bookType="Fiction";
		kid.registerAccount();
//		kid.age=5;
//		kid.bookType="Kids";
//		adu.age=23;
//		adu.bookType="Fiction";
//		adu.registerAccount();
	}
}
