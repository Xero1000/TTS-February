package default_package;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
//      Scanner input = new Scanner(System.in);
//        
//    	//System.out.printf("Hello World!\n");
//      //System.out.printf("Today is awesome!\n");
//        
//      System.out.println("What is your name?");
//      String firstName = input.nextLine();
//      System.out.printf("Hello %s!\n", firstName);
//      System.out.printf("Goodbye %s!\n", firstName);
    	
    	Scanner userInput = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = userInput.nextLine();
        System.out.println("What is your last name?");
        String lastName = userInput.nextLine();
        System.out.printf("Hello %s %s!\n", firstName, lastName);
        System.out.printf("Goodbye %s, %s!\n", lastName, firstName);
    }
}


