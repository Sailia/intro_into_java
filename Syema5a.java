import java.util.Scanner;

public class Syema5a
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      int integer;
           
      do
      {
         System.out.print("Enter an odd integer: ");
         integer = input.nextInt();
      } while ( integer % 2 == 0 || integer < 0 );  
       
      
      int count = 1;
      while(count <= integer)
      {
         if( count % 3 == 0 )
         {
             System.out.println( "3 is a multiple of: " + count);
             
         }
         count++;
        
      }
   }

}