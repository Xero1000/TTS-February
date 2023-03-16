package data_structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(5);
		arraylist.add(5);
		arraylist.add(5);
		
		for (int i = 0; i < arraylist.size(); i++) {
			Integer num = arraylist.get(i);
			System.out.println(num);
		}
		System.out.println("end of list \n");
		
		for (Integer num: arraylist) {
			System.out.println(num);
		}
		
		// using an iterator
		Iterator<Integer> iterator = arraylist.iterator();
		while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
		
		hashmap();
		forEachExercise();
	}
	
	public static void hashmap() {
		// person = {Joan=22, Daniel=42, Anna=34}
		
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		hashmap.put("Joan", 22);
		hashmap.put("Daniel", 42);
		hashmap.put("Anna", 34);
		
		
		//loop through the hash map and return each key/value pair
		for (Map.Entry<String, Integer> entry : hashmap.entrySet()){
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ":" + value);
			// System.out.println(entry);
		}
		// System.out.println(hashmap.entrySet());
	}
	
	public static void forEachExercise() {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter number: ");
			int number = in.nextInt();
			numbers.add(number);
		}
		
		int sum = 0;
		int product = 1;
		Integer largest = null;
		Integer smallest = null;
		
		for (Integer num: numbers) {
			sum += num;
			product *= num;
			if (largest == null) {
				largest = num;
				smallest = num;
			}
			if (largest < num) {
				largest = num;
			}
			if (smallest > num) {
				smallest = num;
			}
		}
		
		System.out.println(sum);
		System.out.println(product);
		System.out.println(largest);
		System.out.println(smallest);
	}
	
	public static void mapEntryExercise() {
		
	}
}
