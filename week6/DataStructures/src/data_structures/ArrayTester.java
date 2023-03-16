package data_structures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class ArrayTester {

	public static void main(String[] args) {
//		//creates an array of strings 
//		String[] fruit;
//
//		//creates an array of integers
//		int[] classSize;
//
//		//creates an array of boolean
//		boolean[] brokenLights;
//
//		//creates an array of names
//		String[] names = {"John", "Daryl", "Mike", "Sarah", "Michelle"};
//		
//		String[] my_array = {"mary","sybil","edith"};
//
//		System.out.println(my_array[1]);
//		 // returns "sybil"
		
		String[] my_array = {"Aaron","Joan","Layla"};

        System.out.println(my_array[1]);
        // returns "Joan"
        int size = my_array.length;
        System.out.println(size);
          // returns the length or size of the array (3)
        
        collections();
	}
	
	public static void collections() {
		ArrayList <Integer> otherArray = new ArrayList<Integer>(2);
		
		String[] my_array = {"Aaron","Joan","Layla"};
		ArrayList <String> my_array_arraylist = new ArrayList<String>();
		
		//adds elements to the end of the array
		my_array_arraylist.add("John");
		my_array_arraylist.add("Heather");
		my_array_arraylist.add("Joe");
		
		//adds an element to a specifc index
		my_array_arraylist.add(2, "Finn"); //adds "Finn" to index 2, moves "Joe" to index 3
		
		//retrieves element values based on index number      
	    my_array_arraylist.get(1);  //returns "Heather"
	    
	    //removes an element from an ArrayList
	    my_array_arraylist.remove("Finn"); //takes "Finn" out of the list, moves "Joe" back to index 2
	    // index 3 no longer exists
	    
	    //my_array_arraylist = {John, Heather, Joe, Finn} //original ArrayList

		//reverse the contents by calling Collections.reverse(ArrayListName)
	    Collections.reverse(my_array_arraylist);
	    // =>[Finn, Joe, Heather, John] //after reversing the elements
	
	    //Get the size of the ArrayList
	    System.out.println(my_array_arraylist.size());
	    // => 4
	
	    //Checks the array list for a specific element
	    my_array_arraylist.contains("Heather");
		// => true
	
		//remove all elements from list
	    my_array_arraylist.clear(); 
		// => names ={}
	    
	    //Create a new string
	    String myString = "I really love icecream!";

	    //Create another string that holds the split version of the first
	    String[] str = myString.split(" ");

	    //Use the List class to create a new ArrayList          
	    List<String> arrayString = new ArrayList<String>();

	    //Store the contents of our split string as elements in
	    //arrayString using the Array.asList to convert the string into an array
	    arrayString = Arrays.asList(str);
	    //=>[I, really, love, icecream!] //Turns the string myString into an array
	    
	    //ArrayList of strings
	    ArrayList<String> fruitList = new ArrayList<String>();
	    fruitList.add("Apple");
	    fruitList.add("Banana");
	    fruitList.add("Grape");

	    //Convert the list to an Array using .toArray method
	    Object[] fruitArray =  fruitList.toArray();

	    //create a new string to hold the converted array in string form.
	    String fruitString = Arrays.toString(fruitArray);
	    //=>[Apple, Banana, Grape] //output of fruitString


	    //to remove brackets and commas, use the String method .replace
	    System.out.println(Arrays.toString(fruitArray)
	    .replace("[","").replace("]","").replace(",", " "));
	    //=> Apple Banana Grape
	}
}