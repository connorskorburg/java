package animals;

public class Mammal {
	int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergy() {
		return energyLevel;
	}
}