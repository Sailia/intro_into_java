import java.util.Scanner;

public class P6
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter a number");
      
      int a = input.nextInt();
      
      System.out.print("Please enter a number");
      int b = input.nextInt();
      
      System.out.print("Please enter a number");
      int c = input.nextInt();
      
      if( a % 2 != 0 && b % 2 != 0 && c % 2 != 0){ 
         System.out.println("3 Integers are odd");
      }
      else if( a % 2 != 0 && b % 2 != 0 || a % 2 != 0 && c % 2 != 0 || c % 2 != 0 && b % 2 != 0) {
         System.out.println("2 Integers are odd");
      }
      else if( (a % 2 != 0) || (c % 2 != 0) || (b % 2 != 0)) {
         System.out.println("1 Integer is odd");
      }
      else {
         System.out.println("No integer is odd");
      }
      
   }

}