import java.util.Scanner;

public class Example2  {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      double a, b, c;
      
      System.out.print( "Enter numbers: " + (a = input.nextDouble()) + " " + (b = input.nextDouble()) + " " + (c = input.nextDouble()) );

      double sum = a + b + c;
      System.out.println("Sum: " + sum);
      
      double product = a * b * c;
      System.out.println("Product: " + product);
      
   }
}