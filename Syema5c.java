import java.util.Scanner;

public class Syema5c
{
   public static void main( String[] args )
   {
      int rand1 = randomNumber();
      int rand2 = randomNumber();
      int product = rand1 * rand2; //or (int) Math.pow(rand1, rand2) lol 
      int response;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Welcome to the multiplication game!");
      System.out.println("What is " + rand1 + " * " + rand2 + "?");
      
      response = input.nextInt();
      
      while ( response != product )
      {
         System.out.println(response + " is not correct, please try again");
         System.out.println("What is " + rand1 + " * " + rand2 + "?");
         response = input.nextInt();
      }
      System.out.println(response + " is correct!");
      
   }
   
   public static int randomNumber()
   {
      int random_num = (int) (Math.random() * 11) + 1;
      return random_num;
   }
   
}