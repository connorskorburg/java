package characters;

public class Wizard extends Human {
	
	private int health = 50;
	private int strength = 3;
	private int intelligence = 8;
	private int stealth = 3;
	
	public void wizard(int health, int strength, int intelligence, int stealth) {
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
	//methods
	public int heal(Human human) {
		return 15;
	}
}
