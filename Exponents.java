import java.util.Scanner;

public class Exponents
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      int a;
      int b;
      int result;
      
      System.out.println("Enter a: ");
      a = input.nextInt();
      System.out.println("Enter b: ");
      b = input.nextInt();
      
      exponent(a, b);
      
   }
   
   public static void exponent( int a, int b )
   {
      int count = 1;
      int result = a;
      
      while (count < b)
      {
         result *= a;
         count++;
      }
      System.out.println(a + " to the power of " + b + " is " + result);
   }

}