package java_calculator_hw;
import java.lang.Math;

public class MagicCalculator extends Calculator{
	
	public static double squareRoot(double num) {
		return Math.sqrt(num);
	}
	
	public static double sin(double num) {
		return Math.sin(num);
	}
	
	public static double cosine(double num) {
		return Math.cos(num);
	}
	
	public static double tangent(double num) {
		return Math.tan(num);
	}
	
	public static int factorial(int num) {
		int result = num;
		for (int i = num - 1; i > 0; i--) {
			result *= i;
		}
		return result;
	}
}
