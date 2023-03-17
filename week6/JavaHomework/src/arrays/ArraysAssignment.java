package arrays;

import java.lang.Math;

public class ArraysAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Problem 1
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int sum = 0;		
		
		for (int number : numbers) {
			sum += number;
		}
		System.out.printf("Sum of numbers array: %d \n", sum);
		
		
		
		// Problem 2
		
		double[ ] exampleArray = {1,5,6,5,4,1};
        double maximum = exampleArray[0];
        int index = 0;
        
        for (int i = 1; i<exampleArray.length; i++){
             if (exampleArray[ i ] > maximum) {
                  maximum = exampleArray[ i ];
                  index = i;
             }
        }
        System.out.println(index);
        // Output = 2 
        
        
        
        // Problem 3
        
        int size = 4;
        int power = 2;
        int[] powers = toPower(size, power);
        
        System.out.print("Problem 3 Result: ");
        for (int value: powers) {
        	System.out.print(value + " ");
        }
	}
	
	public static int[] toPower(int size, int power) {
		int[] powers = new int[size];
		
		for (int i = 0; i < powers.length; i++) {
			powers[i] = (int) Math.pow(i, power);
		}
		
		return powers;
	}
}
