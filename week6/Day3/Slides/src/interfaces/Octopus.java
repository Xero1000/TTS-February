package interfaces;

public class Octopus implements AquaticAnimal{
	
	public void makeNoise() {
		System.out.println("Blub blub blub...");
	}
	
	public int getLegs() {
		return 8;
	}
	
	public boolean isEthansFavoriteAnimal() {
		return true;
	}
	
	public void swim() {
		System.out.println("I am swimming and an octopus");
	}
	
	public boolean canThinkWithTheirTentacles() {
		return true;
	}
	
	public boolean canSeeColorWithTheirSkin() {
		return true; 
	}
}
