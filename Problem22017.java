import java.util.Scanner;

public class Problem22017  {
   public static void main(String[] args) {
      int number = 1;
      int secondNumber = 0;
      int counter = -1;
      
      Scanner input = new Scanner(System.in);
      
      while(secondNumber < number)  {
         counter++;
         System.out.print("Enter an integer greater than " + secondNumber + ":");
         secondNumber = number;
         number = input.nextInt();
      }
      System.out.print("Number of larger integers entered: " + counter);
   }
}