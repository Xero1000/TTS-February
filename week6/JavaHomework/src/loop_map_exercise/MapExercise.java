package loop_map_exercise;
import java.util.HashMap;
import java.util.Scanner;

public class MapExercise {

	public static void main(String[] args) {
		HashMap<String, String> vehicles = new HashMap<String, String>();
		vehicles.put("Avalon", "Toyota");
		vehicles.put("Altima", "Nissan");
		vehicles.put("Accent", "Hyundai");
		vehicles.put("Elantra", "Hyundai");
		vehicles.put("Camry", "Toyota");
		
		Scanner in = new Scanner(System.in);
		System.out.print("What model car are you looking for? ");
		String model = in.nextLine();
		
		if (vehicles.containsKey(model)) {
			System.out.printf("Oh, you're looking for a %s? Our %s selection is right over here...", model, vehicles.get(model));
		}
		else {
			System.out.printf("I'm sorry, I'm afraid we don't have %s cars...", model);
		}
	}

}
