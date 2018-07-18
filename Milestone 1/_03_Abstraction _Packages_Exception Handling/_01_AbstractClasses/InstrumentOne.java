package _01_AbstractClasses;

abstract class Instrument {
	abstract void play();
}
class Piano extends Instrument{
	@Override
	void play() {
		System.out.println("Piano is playing  tan tan tan tan");  
	}
}
class Flute extends Instrument{
	@Override
	void play() {
		System.out.println("Flute is playing  toot toot toot toot"); 
	}
}
class Guitar extends Instrument{
	@Override
	void play() {
		System.out.println("Guitar is playing  tin  tin  tin"); 
	}
}

public class InstrumentOne{
	public static void main(String[] args) {
		Instrument[] arr=new Instrument[10];
		arr[1]=new Piano();
		arr[2]=new Flute();
		arr[3]=new Guitar();
		for(int i=1;i<=3;i++) {
			
		if(arr[i] instanceof Instrument)
		{
			arr[i].play();
			System.out.println();
		}
		}
	}
}
