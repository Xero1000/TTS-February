package java_calculator_hw;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculator.add(12, 3));
		System.out.println(Calculator.subtract(12, 3));
		System.out.println(Calculator.multiply(12, 3));
		System.out.println(Calculator.divide(12, 3));
		System.out.println(Calculator.square(5));
		System.out.println();
		
		System.out.println(MagicCalculator.add(12, 3));
		System.out.println(MagicCalculator.subtract(12, 3));
		System.out.println(MagicCalculator.multiply(12, 3));
		System.out.println(MagicCalculator.divide(12, 3));
		System.out.println(MagicCalculator.square(5));
		System.out.println();
		
		System.out.println(MagicCalculator.squareRoot(25));
		System.out.println(MagicCalculator.sin(180));
		System.out.println(MagicCalculator.cosine(180));
		System.out.println(MagicCalculator.tangent(180));
		System.out.println(MagicCalculator.factorial(6));
	}

}
