import animals.Mammal;
import animals.Gorilla;
import animals.Bat;
public class MammalTest {
	public static void main(String args[]) {
		Mammal animal = new Mammal();
		System.out.println(animal.displayEnergy());	
		Gorilla test = new Gorilla();
		System.out.println(test.throwSomething());
		System.out.println(test.eatBananas());
		System.out.println(test.climb());
		System.out.println(test.eatBananas());
		System.out.println(test.eatBananas());
		System.out.println(test.climb());
		Bat testBat = new Bat();
		System.out.println(testBat.displayEnergy());
		System.out.println(testBat.fly());
		System.out.println(testBat.eatHumans());
		System.out.println(testBat.eatHumans());
		System.out.println(testBat.attackTown());
	}
}
