import java.util.Scanner;

public class CharExamples
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a word: ");
      String word = input.nextLine();
      
      char firstLetter = word.charAt(0);
      
      System.out.println("The first letter is: " + firstLetter); 
   }
}