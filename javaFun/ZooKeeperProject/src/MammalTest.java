
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
	}
}
