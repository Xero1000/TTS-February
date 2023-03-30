package generics;

public class GenericMethodPractice {
   public static < W > void arrayContents( W[] arrayIn) {
  
      for(W element : arrayIn) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }
   
   public static <T extends Comparable<T>> int greaterThan(T[] numArray, T elem) {
	    int count = 0;
	    for (T e : numArray)
	        if (e.compareTo(elem) > 0)
	            ++count;
	    return count;
	}

   public static void main(String args[]) {
      // Create 3 arrays of Integer, String and Character data types
      Integer[] intArray = { 10, 20, 30, 40, 50 };
      String[] stringArray = { "Java", "Ruby", "Python", "Swift"};
      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

      System.out.println("Array integerArray contains:");
      arrayContents(intArray);   

      System.out.println("\nArray stringArray contains:");
      arrayContents(stringArray);   

      System.out.println("\nArray characterArray contains:");
      arrayContents(charArray); 
      
      System.out.println(greaterThan(intArray, intArray[0]));
      System.out.println(greaterThan(stringArray, stringArray[0]));
   }   
}

