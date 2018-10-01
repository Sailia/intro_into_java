import java.util.Scanner;

public class CheckRange 
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      int a;
      int b;
      
      System.out.println("Enter a: ");
      a = input.nextInt();
      System.out.println("Enter : ");
      b = input.nextInt();
      
      int sum = a + b;
      
      if(sum >= 10 & sum <= 19)
      {
         System.out.println("Sum is in range");
      }
      else if(sum < 10)
      {
         System.out.println("Sum is beneath the range");
      }
      else
      {
         System.out.println("Sum is above the range");
      }
      
   }
}