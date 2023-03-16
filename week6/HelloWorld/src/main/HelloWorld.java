package main;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// integer called number
		// int number; // integer variable declaration

		// boolean called answer
		// boolean answer = true; // boolean declaration and definition
		
//		// legal but not recommended
//		int pop, top, can;
//		 
//		// recommended
//		int pop;
//		int top;
//		int can;
//		
//		// legal, but runs the risk of forgetting to initialize (assign values)
//		int pop, top, can; 
//
//		// legal but not recommended
//		int pop=0, top=0, can=0;
//		 
//		// recommended
//		int pop = 0;
//		int top = 0;
//		int can = 0;
		
		// String newString = "hi"
//		char answer = 'Y';             // 'Y' as the explicit character value
//		char middleInitialC = 0x0043;  // 'C'as a hexidecimal
//		char lowerCaseA = '\u0061';      // 'a' as a unicode 
//		char capitalK = 75;            // 'K' as an integer value
		
//		long BigLong = 230L;          // long (l, L)  
//		float SomeFloat = 927.42f;    // float (f, F)  
//		double someDbl = 392.2d;      // double (d, D)  
//		double wishfulSalary = 123_000_100_325.0d; // stored/printed as 123000100325.0

//		byte b = (byte) 2321;
//
//		int smallInt = 120;   //int is 4 bytes
//		int biggerInt = 550;  //int is 4 bytes
//
//		//downcasting 4 bytes into 1 byte
//		byte b1= (byte)smallInt;  //value in both will be 120
//		byte b2= (byte)biggerInt; //value out of range, will be truncated
//		System.out.println(b1);
//		System.out.println(b2);
//
//		//downcasting 4 bytes into 2 bytes
//		short s1= (short)biggerInt;   //value in range, no truncation
//		System.out.println(s1);
		
//		int a = 11;
//		int b = 5;
//		int result = a / b; 
//		int remainder = a % b;
//		System.out.println(result);
//		System.out.println(remainder);
		
//		int x = 5; 
//		System.out.println(x++);  // prints 5
//		System.out.println(x);    // prints 6
//		System.out.println(++x);  // prints 7
		
//		int num1 = 2; //=> 2
//		int num2 = 4; //=> 4
//		num1 += num2; //value of num1 = 6: same as num1 = num1 + num2
//
//		num2 -= num1; //value of num2 = 2
//
//		num1 *= num2; //value of num1 = 8
//
//		num2 /= num1; //value of num2 = 2
		
//		int sum = 20;
//		if (sum > 13 && sum < 26) {
//		    System.out.println("Right in the sweet spot.");
//		} else {
//		    System.out.println("Too little, too much.");
//		}
//
//		String choice = "cash";
//		// when comparing strings remember to use equals() method
//		if (choice.equals("cash") || choice.equals("credit")) {
//		    System.out.println("Thanks for shopping at our store.");
//		} else {
//		    System.out.println("Sorry, we don't accept checks.");
//		}
		
//		madLib();
		
// Naming Conventions
		// known as camel case, first word lower case and subsequent words capitalized
		// int currentScoreOfGame;  

		// known as snake case, all lower case with an underscore between each word
		//this is not really a convention often used in java, but might appear in other languages
		// int current_score_of_game; 

		// known as Pascal case, first letter of each word capitalized
		// int FinalScoreOfGame;

		// leading underscore sometimes used for short-lived or special purpose names
		// int _membersOutOfTown;  

		// Not used often in Java, more often in JavaScript to denote a variable tied to an event
		// int $amountOfBill;

		// All Caps with an underscore between words is a common convention for constant values
		// double TAX_RATE = 7.0;
		
// Scope and Modifiers
//		ScopeExamples scopeExamples = new ScopeExamples();
//		scopeExamples.aClassVariable = 2;
//		scopeExamples.methodOne();

// Compare
//		Integer a = 2;
//		Integer b = 1;
//		System.out.println(Integer.compare(a, b));

// String type
		// Two ways to make the string
		// Literal assignment or string constructor
//		String s1 = "Hello";
//		String s2 = new String("World");
//		
//		String longGreeting = s1 + " " + s2 + " from Java!";
//		// longGreeting will now be "Hello World from Java!"
//		
//		int ndex = longGreeting.indexOf('W');             // ndex equal to 6
//		int last = longGreeting.lastIndexOf('o');         // last equal to 14
//		boolean contains = longGreeting.contains("fro");  // true
//		boolean starts = longGreeting.startsWith("h");    // false
//		char charVal = longGreeting.charAt(10);           // 'd'
//		String lan = longGreeting.substring(17);          // lan = Java!
//		String planet = longGreeting.substring(6, 11);    // planet = World
//		boolean noNums = longGreeting.matches("d+");      // false - regular expression search for any number
//		
//		String str = String.format("%s was found at position %d.", planet, ndex);
		
// String Comparison (Using Object.equals())
		// Using Object.equals() checks value equality and is best for string comparisons
		// Strings are objects so object.equals() works
//		String word1 = "Hello";
//		String word2 = "Hello";
//		String word3 = "Goodbye";
//
//		word1.equals(word2); //true
//		word1.equals(word3); //false
//
//		// These two have the same value
//		new String("Hello World").equals("Hello World") // --> true 
//
//		// "==" checks if they are the same object, and they are not the same object
//		//One is a string object the other is a literal
//		new String("Hello World") == "Hello World" // --> false 
//
//		// These are both String objects, but not the same 
//		new String("Hello World") == new String("Hello World") // --> false 
//
//		// Literals are interned strings and seen as the same object by the compiler 
//		"test" == "test" // --> true 
//
//		// String literals are concatenated by the compiler yet the results are not seen as the same object.
//		"Hello World" == "Hello " + "World" // --> false
//
//		String str1 = new String("Hello World");
//		String str2 = new String("Hello World");
//		
//		System.out.println(str1 == str2); // return false 
//		System.out.println(str1.equals(str2)); // return true
		
		guessingGame();
		//andOrExercise();
	}
	
//	public static void madLib() {
//		int ageLimit = 18;
//
//		System.out.println("How old are you?");
//		
//		int age = Integer.parseInt(in.nextLine());
//		
//		if (age > ageLimit) {
//			System.out.print("You are above the limit");
//		}
//		else if (age == ageLimit) {
//			System.out.print("You are at the limit");
//		}
//		else {
//			System.out.print("You are below the limit");
//		}
//	}
	
	public static void guessingGame() {
		Scanner in = new Scanner(System.in);
		
		int answer = 7;
		System.out.println("Enter a number between 1 and 10: ");
		int guess = Integer.parseInt(in.nextLine());
		
		if (guess == answer) {
			System.out.println("Wow!");
		}
		else {
			System.out.println("Nope!");
		}
	}

	public static void andOrExercise() {
		Scanner in = new Scanner(System.in);
		
		int answer = 69;
		System.out.println("Enter a number between 1 and 100: ");
		int guess = Integer.parseInt(in.nextLine());
		
		if (guess == answer) {
			System.out.println("Wow!");
		}
		else {
			if (answer - guess <= 5 && answer - guess >= -5) {
				System.out.println("Oh! So close!");
			}
			else {
				System.out.println("Nope!");
			}
		}		
	}
}

