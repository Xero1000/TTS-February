package ExceptionsAndErrors;

public class ArrayAccess {

   public static void main(String args[]) {
      try {
         String[] fruit = new String[2];
         fruit[0] = "apple";
         fruit[1] = "grapes";
         System.out.println("Access element three :" + fruit[3]);
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown  :" + e);
      } finally {
      System.out.println("Finally, out of the block");
    }
  }
}