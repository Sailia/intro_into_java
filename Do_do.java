import java.util.Scanner;

public class Do_do
{
   public static void main( String[] args )
   {
      int count = 1;
      Scanner input = new Scanner(System.in);
      int user;
      
      do
      {
         System.out.println("Enter an int: ");
         user = input.nextInt();   
         
      }while ( user % 2 != 0 );
      
   }

}