package main;

public class JavaTypesVariablesAndBranching {

	public static void main(String[] args) {
		
		// illegal field names
		int 1variable = 5;
		System.out.println(1variable);
		int #pound = 3;
		System.out.println(#pound);
		
		// uninitialized fields
		int v1;
		int v2;
		System.out.println(v1);
		System.out.println(v2);
		
		// Calling a variable outside its scope
		if (true) {
			int innerVariable = 4;
		}
		System.out.println(innerVariable);

	}

}
