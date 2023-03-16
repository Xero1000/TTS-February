package data_structures;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> animalList = new LinkedList<String>();
		animalList.add("frog");
		animalList.add("giraffe");
		animalList.add("buffalo");
		animalList.add("mongoose");
		System.out.println(animalList);
		// => [frog, giraffe, buffalo, mongoose]

		// Puts shark as the first element in the ArrayList
		animalList.addFirst("shark"); 
		System.out.println(animalList);
		// => [shark, frog, giraffe, buffalo, mongoose]

		// Puts koala as the last element in the ArrayList
		animalList.addLast("koala"); 
		System.out.println(animalList);
		// => [shark, frog, giraffe, buffalo, mongoose, koala]
		    
		// This adds the value cuttlefish to the 3rd index of the LinkedList
		animalList.add(3, "cuttlefish"); 
		System.out.println(animalList);
		// => [shark, frog, giraffe, cuttlefish, buffalo, mongoose, koala]
		
		animalList.remove(3); 
		// Removes the element that is at the 3rd index of the LinkedList
		animalList.remove("piranha"); 
		// Removes the first instance of "piranha" in the LinkedList

		animalList.removeFirst(); 
		// Removes the first element of the LinkedList
		animalList.removeLast(); 
		// Removes the last elements of the LinkedList

		animalList.contains("giraffe"); 
		// Returns `true` if "giraffe" is present in the LinkedList

		animalList.size(); 
		// Returns an integer denoting the size of the LinkedList

		animalList.get(3); 
		// Returns the value located at the 3rd index of the LinkedList
		animalList.set(3, "emu"); 
		//Sets the value at index 4 to "emu"
		System.out.println(animalList);
		// => [frog, giraffe, buffalo, emu]
	}
}
