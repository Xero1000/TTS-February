package interfaces;

public class TestingClass {
	
	public static void divider() {
		System.out.println("----------------------------");
	}

	public static void main(String[] args) {
		Cat myCat = new Cat();
		myCat.makeNoise();
		System.out.println(myCat.getLegs());
		System.out.println(myCat.isEthansFavoriteAnimal());
		divider();
		
		Dog myDog = new Dog();
		myDog.makeNoise();
		System.out.println(myDog.getLegs());
		System.out.println(myDog.isEthansFavoriteAnimal());
		divider();
		
		Octopus myOctopus = new Octopus();
		myOctopus.makeNoise();
		System.out.println(myOctopus.getLegs());
		System.out.println(myOctopus.isEthansFavoriteAnimal());
		myOctopus.swim();
		System.out.println(myOctopus.canThinkWithTheirTentacles());
		System.out.println(myOctopus.canSeeColorWithTheirSkin());
	}
}
