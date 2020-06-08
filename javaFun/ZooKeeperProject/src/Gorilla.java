
public class Gorilla extends Mammal {
	public int throwSomething() {
		energyLevel = energyLevel - 5;
		System.out.println("Threw a Banana!");
		return energyLevel;
	}
	public int eatBananas() {
		energyLevel = energyLevel + 10;
		System.out.println("I'm eating bananas!");
		return energyLevel;
	}
	public int climb() {
		energyLevel = energyLevel - 10;
		System.out.println("I'm climbing a tree!");
		return energyLevel;
	}
}
