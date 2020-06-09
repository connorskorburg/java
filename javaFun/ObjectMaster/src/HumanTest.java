import characters.Human;
public class HumanTest {

	public static void main(String[] args) {
		Human bob = new Human();
		System.out.println("Health: " + bob.getHealth());
		System.out.println("Strength: " + bob.getStrength());
		System.out.println("Intelligence: " + bob.getIntelligence());
		System.out.println("Stealth: " + bob.getStealth());
		bob.setHealth(200);
		bob.setIntelligence(5);
		bob.setStrength(4);
		bob.setStealth(1);
		System.out.println("Health: " + bob.getHealth());
		System.out.println("Strength: " + bob.getStrength());
		System.out.println("Intelligence: " + bob.getIntelligence());
		System.out.println("Stealth: " + bob.getStealth());
		Human john = new Human();
		bob.attack(john);

	}

}
