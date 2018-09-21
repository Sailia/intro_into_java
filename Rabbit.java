import java.util.Scanner;

public class Rabbit
{
   public static void main( String[] args )
   {
      Scanner kbd = new Scanner(System.in);
      int rabbit, carrot;
      
      System.out.println("Enter an integer: ");
      rabbit = kbd.nextInt();
      System.out.println("Enter an integer: ");
      carrot = kbd.nextInt();
      System.out.println("Start here");
      
      if(rabbit > 10)
      {
         System.out.println("Rabbit is greater than 10");
         if(carrot % 2 == 0)
         {
            System.out.println("Carrot is even");
         }
         else
         {
            System.out.println("Carrot is odd");
         }
      }
      else if(rabbit == 10)
      {
         System.out.println("Rabbit is equal to 10");
         if(carrot > 5)
         {
            System.out.println("Carrot is greater than 5");
         }
         else
         {
            System.out.println("Carrot is less than or equal to 5");
         }
         
      }
         System.out.println("Bye");
         System.out.println("Go home");
   }
}