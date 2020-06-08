package animals;
import animals.Mammal;

public class Bat extends Mammal {
	
	//constructor functions
	public Bat() {
		this.energyLevel = 300;
	}
	public Bat(int level) {
		this.energyLevel = level;
	}
	//methods
	public int fly() {
		energyLevel = energyLevel - 50;
		System.out.println("Taking off!");
		return energyLevel;
	}
	public int eatHumans() {
		energyLevel = energyLevel + 25;
		return energyLevel;
	}
	public int attackTown() {
		energyLevel = energyLevel - 100;
		System.out.println("Town is under attack!");
		return energyLevel;
	}
}
