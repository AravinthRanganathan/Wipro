package live;
import music.Playable;
import music.string.*;
import music.wind.*;
public class Test {
	public static void main(String[] args) {
		Veena v=new Veena();
		v.play();
		Saxophone s=new Saxophone();
		s.play();
		System.out.println();
		System.out.println("-------------Using Playable Variable-----------");
		Playable p =v;
		p.play();
		Playable p1=s;
		p1.play();
	}
}
