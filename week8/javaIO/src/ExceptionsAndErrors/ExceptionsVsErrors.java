package ExceptionsAndErrors;

import java.io.FileInputStream;

public class ExceptionsVsErrors {
	
	public static void main(String[] args) {
		//dividebyZero
		exception();
	}
	
	private static void errors() {
		
	}
	
	private static void exception() {
		
		// unchecked exception
		try {
			int a = 0; 
			int b = 5; 
			int c = b / a; 
		}
		catch (ArithmeticException e) {
			System.out.println("I tried to divide by zero");
			// e.printStackTrace();
		}
		
		//checked exception
		FileInputStream in = null;
		// in = new FileInputStream("C:\\Users\\alexh\\TTS\\TTS-February\\week10\\javaIO\\src\\input.txt");
	}
}
