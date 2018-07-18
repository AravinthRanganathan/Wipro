package _01_AbstractClasses;

abstract class GeneralBank {
	abstract double getSavingInterestRate();
	abstract double getFixedInterestRate();
}
class ICICIBank extends GeneralBank{
	@Override
	double getFixedInterestRate() {
		return 8.5;
	}

	@Override
	double getSavingInterestRate() {
		return 4;
	}
}
class KotMBank extends GeneralBank{
		@Override
		double getFixedInterestRate() {
			return 9;
		}

		@Override
		double getSavingInterestRate() {
			return 6;
		}
}
class Bank{
	public static void main(String[] args) {
		ICICIBank obj1=new ICICIBank();
		KotMBank obj2=new KotMBank();
		GeneralBank obj3=new ICICIBank();
		GeneralBank obj4=new KotMBank();
		System.out.println("ICICI Bank");
		System.out.println(obj1.getFixedInterestRate());
		System.out.println(obj1.getSavingInterestRate());
		System.out.println("KotMBank Bank");
		System.out.println(obj2.getFixedInterestRate());
		System.out.println(obj2.getSavingInterestRate());
		System.out.println("General ICICI Bank");
		System.out.println(obj3.getFixedInterestRate());
		System.out.println(obj3.getSavingInterestRate());
		System.out.println("General KotMBank Bank");
		System.out.println(obj4.getFixedInterestRate());
		System.out.println(obj4.getSavingInterestRate());
	}
}
