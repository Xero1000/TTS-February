package loop_map_exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopExercise {

	public static void main(String[] args) {
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
		
		System.out.println("Sum = " + sum);
		System.out.println("Product = " + product);
		System.out.println("Largest = " + largest);
		System.out.println("Smallest = " + smallest);
	}

}
