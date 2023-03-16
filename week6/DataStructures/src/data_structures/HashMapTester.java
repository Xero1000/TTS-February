package data_structures;
import java.util.HashMap;

public class HashMapTester {

	public static void main(String[] args) {
		//Creates a HashMap with a String as key and Integer as the value it points to
		HashMap<String, Integer> person = new HashMap<>();

		//.put adds items to the hash map
		person.put("Joan", 21);
		person.put("Anna", 34);
		person.put("Mike", 55);
		person.put("Daniel", 42);

		//creates the following HashMap
		// => {Joan=21, Mike=55, Daniel=42, Anna=34}


		//.get retrieves data from the hash map
		person.get("Joan");
		// => 21 //returns the value associated with the key
		
		//.remove takes the specified key and it's value out of the hash map
		person.remove("Mike");
		// => {Joan=21, Daniel=42, Anna=34}

		//replace the value of a given key
		person.put("Joan", 42); 
		// => {Joan=42, Daniel=42, Anna=34} //changes the associated value from 21 to 42

		//checks for a key within a HashMap.  Returns a boolean value
		person.containsKey("Daniel");
		// => true


		//checks for a key within a HashMap.  Returns a boolean value
		person.containsValue(34);
		// => true

		//Returns true if this map contains no key-value mappings.
		person.isEmpty();
		// => false
		
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("fruit", "banana");
		
		if (hashmap.get("veggie") == null) {
			System.out.println("This is my veggie");
		}
		
		if (hashmap.containsKey("fruit")) {
			
		}
	}
	
	public static void collections() {

	}
}
