package hw;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet pet = new Pet();
		Pet pet2 = new Pet("Kiki", 16, "Dog", "Georgia");
		
		// Getting and setting pet
		System.out.println("Age: " + pet.getAge());
		System.out.println("Name: " + pet.getName());
		System.out.println("Type: " + pet.getType());
		System.out.println("Location: " + pet.getLocation());
		System.out.println();
		
		pet.setAge(3);
		pet.setName("Chloe");
		pet.setLocation("Alpharetta");
		pet.setType("Cat");
		
		System.out.println("Age: " + pet.getAge());
		System.out.println("Name: " + pet.getName());
		System.out.println("Type: " + pet.getType());
		System.out.println("Location: " + pet.getLocation());
		System.out.println();
		
		// Getting and setting pet2
		System.out.println("Age: " + pet2.getAge());
		System.out.println("Name: " + pet2.getName());
		System.out.println("Type: " + pet2.getType());
		System.out.println("Location: " + pet2.getLocation());
		System.out.println();
		
		pet2.setAge(2);
		pet2.setName("Sophie");
		pet2.setLocation("Alabama");
		pet2.setType("Cat");
		
		System.out.println("Age: " + pet2.getAge());
		System.out.println("Name: " + pet2.getName());
		System.out.println("Type: " + pet2.getType());
		System.out.println("Location: " + pet2.getLocation());
		System.out.println();
		
		Dragon dragon = new Dragon();
		Dragon dragon2 = new Dragon("Spyro", "purple");
		Dragon dragon3 = new Dragon("Smaug", "red-golden", 180);
		
		// Getting and setting dragon
		System.out.println("Name: " + dragon.getName());
		System.out.println("Scale Color: " + dragon.getScaleColor());
		System.out.println("Age: " + dragon.getAge());
		System.out.println();
		
		dragon.setName("Valefor");
		dragon.setScaleColor("black");
		dragon.setAge(10000);
		
		System.out.println("Name: " + dragon.getName());
		System.out.println("Scale Color: " + dragon.getScaleColor());
		System.out.println("Age: " + dragon.getAge());
		System.out.println();
		
		// Getting dragon2
		System.out.println("Name: " + dragon2.getName());
		System.out.println("Scale Color: " + dragon2.getScaleColor());
		System.out.println("Age: " + dragon2.getAge());
		System.out.println();
		
		// Getting dragon3
		System.out.println("Name: " + dragon3.getName());
		System.out.println("Scale Color: " + dragon3.getScaleColor());
		System.out.println("Age: " + dragon3.getAge());
		
		// Invoking methods returning boolean and a string for dragon3
		System.out.println("Can fly? " + dragon3.canFly());
		System.out.println("Message from Smaug: " + dragon3.messageFromDragon());

	}

}
