package interfaces;

public class Cat implements Animal{
	
	public void makeNoise() {
		System.out.println("Meow...");
	}
	
	public int getLegs() {
		return 4;
	}
	
	public boolean isEthansFavoriteAnimal() {
		return false;
	}
	
}
