import java.util.Scanner;

public class if_structures
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print( "Enter an int: " );
      int first = input.nextInt();
      
      System.out.print( "Enter an int: " );
      int second = input.nextInt();
   
      if( first == second )
      {
         System.out.println( "First and second are equal" );
      }
      
      if( first != second )
      {
         System.out.println( "First and second are not equal" );
      }
   }

}