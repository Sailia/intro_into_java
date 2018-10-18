import java.util.Scanner;

public class Syema4c
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      int num1;
      int num2; 
      num1 = randomNumber(); 
      num2 = randomNumber(); 
      double power = Math.pow(num1, num2);
      
      System.out.println("What is " + num1 + " raised to the power of " + num2 + "?");
      
      double response = input.nextDouble();
      
      if (response == power)
      {
         System.out.println(response + " is correct!");
      }
      else
      {
         System.out.println(response + " is not correct!");
      }
   }
   
   public static int randomNumber()
   {
      //Create random number between 1 and 8 
      int random = (int)(Math.random()*8)+1;
      
      return random;
   }

}