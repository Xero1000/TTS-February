package lambdas;

@FunctionalInterface
interface CalculateExponent {
    int run(int x);
}

public class PassInLambdaShowcase {
  public static void getExponent(int x, CalculateExponent exponentFunction) {
    int result = exponentFunction.run(x);
    System.out.println(result);
  }    
    
  public static void main(String[] args) {
    CalculateExponent squareNumber = (x) -> x * x;
    CalculateExponent cubeNumber = (x) -> x * x * x;
    
    getExponent(5, squareNumber);
    getExponent(5, cubeNumber);
  }
}