// Two different types of execution flow: 
// Sequence: Use when want to execute code line by line.
// Does not use the decision symbol.
// Control Flow (Selection control): Use when want to implement decision making 
// process in the program. Use the decision symbol.   

public class September18
{
   public static void main( String[] args )
   {
      int number = 13;
      
      if(number % 2 == 0)
      {
         System.out.println("Number is even");
      }
      else
      {
         System.out.println("Number is odd");
      }
   }
}