package interfaces;
//Java program to demonstrate Class

//Class Declaration
public class Dog implements Animal{

	public void makeNoise() {
		System.out.println("Woof...");
	}
	
	public int getLegs() {
		return 4;
	}
	
	public boolean isEthansFavoriteAnimal() {
		return false;
	}
	
	public void goOnWalk() {
		System.out.println("I am walking and a dog");
	}
}
