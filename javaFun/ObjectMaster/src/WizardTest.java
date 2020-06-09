import characters.Wizard;
public class WizardTest {

	public static void main(String[] args) {
		Wizard test = new Wizard();
		test.setStealth(10);
		System.out.println("Health: " + test.getHealth());
		System.out.println("Strength: " + test.getStrength());
		System.out.println("Intelligence: " + test.getIntelligence());
		System.out.println("Stealth: " + test.getStealth());
	}

}
