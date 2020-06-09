package characters;

public class Human {
	private int strength = 3;
	private int intelligence = 3;
	private int stealth = 3;
	private int health = 100;
	//constructor
	public void human(int health, int strength, int intelligence, int stealth) {
		this.health = health;
		this.strength = strength;
		this.intelligence = intelligence;
		this.stealth = stealth;
	}
	//setting methods
	public void setHealth(int heal) {
		this.health = heal;
	}
	public void setStrength(int stren) {
		this.strength = stren;
	}
	public void setIntelligence(int i) {
		this.intelligence = i;
	}
	public void setStealth(int s) {
		this.stealth = s;
	}
	//getting methods
	public int getHealth() {
		return this.health;
	}
	public int getStrength() {
		return this.strength;
	}
	public int getIntelligence() {
		return this.intelligence;
	}
	public int getStealth() {
		return this.stealth;
	}
	//attack method
	public void attack(Human human) {
		human.setHealth(human.getHealth() - strength);
		System.out.println("I attacked this human for " + this.getStrength() + " points!");
	}
	
}
