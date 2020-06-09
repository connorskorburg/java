package characters;

public class Human {
	protected int strength = 3;
	protected int intelligence = 3;
	protected int stealth = 3;
	protected int health = 100;
	//constructor
	public Human() {
	}
	//setting methods
	public void setHealth(int health) {
		this.health = health;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	//getting methods
	public int getHealth() {
		return this.health;
	}
	public int getStrength() {
		return strength;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public int getStealth() {
		return stealth;
	}
	//attack method
	public void attack(Human human) {
		human.setHealth(human.getHealth() - strength);
		System.out.println("I attacked this human for " + this.getStrength() + " points!");
	}
	
}
