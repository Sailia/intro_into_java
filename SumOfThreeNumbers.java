import java.util.Scanner;

public class SumOfThreeNumbers   {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      double a, b, c;
      
      System.out.print("Enter number 1: ");
      a = input.nextDouble();
      System.out.print("Enter number 2: ");
      b = input.nextDouble();
      System.out.print("Enter number 3: ");
      c = input.nextDouble();
      
      double sum = a + b + c;
      System.out.println("Sum: " + sum);
      
      double product = a * b * c;
      System.out.println("Product: " + product);
      
   }
}