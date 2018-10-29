import java.util.Scanner;

public class GuessNumberOneTime
{
   public static void main( String[] args )
   {
      
      System.out.println("Guess a magic number between 0 and 100");
      int random = getRandomNumber();
      boolean isCorrect = checkGuess(getInput(), random);
      
      while(isCorrect == false)
      {
         isCorrect = checkGuess(getInput(), random);   
      }
      
      result(random);
   }
   
   public static int getRandomNumber()
   {
      int randomNumber = (int)(Math.random() * 100);
      return randomNumber;
   }
   
   public static int getInput()
   {
      int randomGuess;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your guess: ");
      randomGuess = input.nextInt();
      return randomGuess;
   }
   
   public static boolean checkGuess(int guess, int number)
   {  
      if(guess < number)
      {
         System.out.println("Too low!");
         return false;
      }
      else if(guess > number)
      {
         System.out.println("Too high!");
         return false;
      }
      else{  
         return true;
      }
   }
   
   public static void result(int number)
   {
      System.out.println("Yes, the number is " + number);   
   }

}