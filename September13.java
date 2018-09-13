import java.util.Scanner;

public class September13
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      int num1;
      int num2;
      
      boolean true_false = true;
      
      System.out.println( "Please enter your first number: " );
      
      num1 = input.nextInt();
      
      System.out.println( "Please enter your second number: " );
      
      num2 = input.nextInt();
      
      boolean result = ( num1 > 0 ) && ( num2 > 0 );
      
      System.out.println( "Are both your numbers greater than 0?" );
      
      System.out.println( "result is: " + result );
      
   
   }

}