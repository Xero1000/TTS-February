package lambdas;

//import java.util.ArrayList;
//
//public class Main {
//	interface IntegerMath {
//        int operation(int a, int b);   
//    }
//  
//	public class Addition implements IntegerMath{
//		public int operation(int a, int b) {
//			return a + b; 
//		}
//	}
//	
//	public class Subtraction implements IntegerMath{
//		public int operation(int a, int b) {
//			return a-b; 
//		}
//	}
//
//	public static void main(String[] args) {
//		Main myApp = new Main();
//		Main.Addition addition = myApp.new Addition();
//		Main.Subtraction subtraction = myApp.new Subtraction(); 
//		
//		System.out.println(addition.operation(12, 4));
//		System.out.println(subtraction.operation(40, 6));
//	}
//}

public class Main {
	
	@FunctionalInterface
	interface IntegerMath {
        int operation(int a, int b);   
    }

    public static void main(String[] args) {
    IntegerMath addition = (a,b) -> a+b; 
    IntegerMath subtraction = (a,b) -> a-b; 

    System.out.println(addition.operation(10, 4));
    System.out.println(subtraction.operation(10, 4));
	}
} 