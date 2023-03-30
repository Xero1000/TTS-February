package ExceptionsAndErrors;

import java.util.InputMismatchException;
import java.util.Scanner;

//public class Main {
//  public static void main(String[] args) {
//    int x = getIntLBYL();
//    System.out.println("x is " + x);
//  }
//
//  public static int getIntLBYL() {
//    Scanner s = new Scanner(System.in);
//    boolean isValid = true;
//    System.out.println("Please enter a number.");
//    String input = s.next();
//    
//    for(int i=0; i<input.length(); i++) {
//      if(!Character.isDigit(input.charAt(i))) {
//        isValid = false;
//        break;
//      }
//    }
//    
//    if(isValid) {
//      return Integer.parseInt(input);
//    }
//    return 0;
//  }
//}

public class Main {
  public static void main(String[] args) {
    int x = getIntEAFP();
    System.out.println("x is " + x);
  }

  public static int getIntEAFP() {
    Scanner s = new Scanner(System.in);
    System.out.println("Please enter a number.");
    try {
      return s.nextInt();
    } catch(InputMismatchException e) {
      return 0;
    }
  }
}
