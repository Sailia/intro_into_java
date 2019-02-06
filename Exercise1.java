import java.util.Scanner;

public class Exercise1  {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int userInput, computer;
      System.out.print("Enter 0 (Heads) or 1 (Tails): ");
      userInput = input.nextInt();
      double d = Math.random();
      computer = (int) (d * 2);
      if(computer == 0) {
         System.out.println("Coin flip: Heads");
      } else  {
         System.out.println("Coin flip: Tails");
      }
      
      if(userInput == computer)  {
         System.out.println("Correct!");
      } else   {
         System.out.println("Nope!");
      }     
   }
}