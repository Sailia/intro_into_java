import java.util.Scanner; 

public class Syema5b{

   public static void main( String[] args ) {
      int even_number = getInput();   
      int sum = sumAllEvens(even_number);
      
      System.out.println("Sum of all even numbers between 2 and " + even_number + " is: " + sum );
   }  
   
   public static int getInput()
   {
      Scanner input = new Scanner(System.in);
      int even;
      
      do
      {
         System.out.print("Enter an even integer: ");
         even = input.nextInt();
      } while ( even % 2 != 0 );

      return even;
   }
    
   public static int sumAllEvens( int x )
   {
      int fromTwo = 2;
      int sum = 0;
      
      while (x >= fromTwo)
      {
         sum += x;
         x = x - 2; 
      }
      return sum;
   }  
}
