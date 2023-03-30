package generics;

public class GenericClass<G> {
   G g;

   public void add(G g) {
      this.g = g;
   }

   public G get() {
      return g;
   }

   public static void main(String[] args) {
      GenericClass<Boolean> booleanGenericClass = new GenericClass<Boolean>();
      GenericClass<String> stringGenericClass = new GenericClass<String>();
    
      booleanGenericClass.add(new Boolean(true));
      stringGenericClass.add(new String("I'm a string"));

      System.out.printf("Boolean Value : %b\n\n", booleanGenericClass.get());
      System.out.printf("String Value : %s\n", stringGenericClass.get());
   }
}