import java.util.Scanner;

public class LastDigits
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      int x;
      int y;
      
      System.out.println("Enter the first int: ");
      x = input.nextInt(); 
      
      System.out.println("Enter the first int: ");
      y = input.nextInt(); 
      
      System.out.println("They have the same last digit? " + sameLastDigits(x,y));
   }
   
   public static boolean sameLastDigits(int x, int y)
   {
      int first_last_digit = x % 10;
      int second_last_digit = y % 10;
      
      System.out.println(first_last_digit);
      System.out.println(second_last_digit);
      
      if(first_last_digit == second_last_digit)
      {
         return true;
      }
     return false;   
   }

}