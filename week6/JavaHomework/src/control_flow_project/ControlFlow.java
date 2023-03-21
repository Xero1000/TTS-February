package control_flow_project;
import java.util.Random;
import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ascii ranges printed
		AsciiChars.printNumbers();
		AsciiChars.printUpperCase();
		AsciiChars.printLowerCase();
		System.out.println();
		
		// User enters name
		Scanner in = new Scanner(System.in);
		String name = validateString("Enter your name: ", "Please enter your actual name");
		System.out.println("Hello " + name + "\n");
		
		String resp = validateYesOrNo("Would you like to continue to the interactive portion? (Enter yes(or y) or no(or n)): ");
		
		if (resp.equals("yes") || resp.equals("y")) {
			
			int[] lottery_numbers = new int[6];
			
			// Variables for question answers
			boolean red_car;
			String favorite_pet;
			int favorite_pet_age = 0;
			int lucky_number = 0;
			boolean favorite_quarterback;
			int jersey_number = 0;
			int car_model_year;
			String actor_first_name;
			
			Random random = new Random();
			
			int magic_ball;
			
			// User can generate new numbers until they decide they're done
			while (true) {
				resp = validateYesOrNo("Do you have a red car? (Enter yes(or y) or no(or n)): ");
				if (resp.equals("yes") || resp.equals("y")) {
					red_car = true;
				}
				else {
					red_car = false;
				}
				
				favorite_pet = validateString("What is the name of your favorite pet? ", "Please enter an actual name");
				
				favorite_pet_age = validateInteger("How old is your favorite pet? ", "Please enter an integer for your pet's age");
				
				lucky_number = validateInteger("What is your lucky number? ", "Please enter an integer for your lucky number");
				
				resp = validateYesOrNo("Do you have a favorite quarterback? (Enter yes(or y) or no(or n)): ");
				
				if (resp.equals("yes") || resp.equals("y")) {
					favorite_quarterback = true;
					jersey_number = validateInteger("What is their jersey number? ", "Please enter an integer for the jersey number");
				}
				else {
					favorite_quarterback = false;
				}
				
				car_model_year = validateInteger("What is the two digit year of your car? ", "Please enter an integer for the two digit year of your car");
				
				actor_first_name = validateString("What is the first name of your favorite actor or actress? ", "Please enter an actual actor/actress name");
				
				int rand1 = random.nextInt(1, 75); // for getting magic ball
				int rand2 = random.nextInt(1, 65); // for getting the second number
				int rand3 = random.nextInt(1, 50); // for getting the second number (rand3 - rand2)
				
				// if user said they had a favorite quarterback, the jersey number is used for the magic ball
				// otherwise the lucky number is used
				if (favorite_quarterback) {
					magic_ball = jersey_number + rand1;
				}
				else {
					magic_ball = lucky_number + rand1;
				}
				
				// keeps magic ball between 1 and 75
				while (magic_ball > 75) {
					magic_ball -= 75;
				}
				
				lottery_numbers[0] = (int) favorite_pet.charAt(2) - 65;
				lottery_numbers[1] = rand3 - rand2;
				
				// keeps second lottery number above 0
				if (lottery_numbers[1] < 1) {
					lottery_numbers[1] += 65;
				}
				
				lottery_numbers[2] = (int) actor_first_name.charAt(0) - 64;
				lottery_numbers[3] = (int) actor_first_name.charAt(actor_first_name.length() - 1) - 64;
				lottery_numbers[4] = 42;
				lottery_numbers[5] = jersey_number + favorite_pet_age + lucky_number;
				
				// keeps the final lottery number between 1 and 65
				while (lottery_numbers[5] > 65) {
					lottery_numbers[5] -= 65;
				}
				
				// Lottery numbers are printed
				System.out.print("\nLottery Numbers: ");
				for (int i = 0; i < lottery_numbers.length; i++) {
					if (i != lottery_numbers.length - 1) {
						System.out.print(lottery_numbers[i] + ", ");
					}
					else {
						System.out.print(lottery_numbers[i] + " ");
					}
				}
				
				System.out.println("Magic Ball: " + magic_ball);
				resp = validateYesOrNo("Would you like to generate a new set of numbers?(Enter yes(or y) or no(or n)): ");
				
				// if user enters anything other than yes, the loop breaks 
				if (resp.equals("no") || resp.equals("n")) {
					System.out.println("Thank you for completing!");
					break;
				}
			}
		}
		else {
			System.out.println("Please return later to complete the survey");
		}
	}
	
	// Makes sure user enters an actual positive integer value
	public static int validateInteger(String prompt, String errorMessage) {
		Scanner in = new Scanner(System.in);
		boolean valid = false;
		int answer = 0;
		
		while (!valid) {
			try {
				System.out.print(prompt);
				answer = in.nextInt();
				if (answer > 0) {
					valid = true;
				}
				else {
					System.out.println("Enter a positive integer\n");
				}
			}
			catch (Exception e) {
				System.out.println(errorMessage + "\n");
				in.nextLine();
			}
		}
		System.out.println();
		return answer;
	}
	
	// makes sure the user enters a string with only letters
	public static String validateString(String prompt, String errorMessage) {
		Scanner in = new Scanner(System.in);
		String answer = "";
		
		outer:
		while (true) {
			System.out.print(prompt);
			answer = in.nextLine();

			char[] answerCharArray = answer.toCharArray();
			
			for (char character : answerCharArray) {
				if (!Character.isLetter(character)) {
					System.out.println(errorMessage + "\n");
					continue outer;
				}
			}
			break;
		}
		System.out.println();
		return answer;
	}
	
	// makes sure the user answers yes, no, y, or n for yes or no questions
	public static String validateYesOrNo(String prompt) {
		Scanner in = new Scanner(System.in);
		String answer = "";
		
		while (true) {
			System.out.print(prompt);
			answer = in.nextLine().toLowerCase();

			if (answer.equals("yes") || answer.equals("y") || answer.equals("no")|| answer.equals("n")) {
				break;	
			}
			else {
				System.out.println("Please enter yes(or y) or no(or n)\n");
			}
		}
		System.out.println();
		return answer;
	}
}
