import java.util.Scanner;

public class UserInput  {
   public static void main(String[] args) {
      System.out.println(getUserInput('X'));
   }
   
   public static void promptPlayerSquare(char p)   {
      if(p == 'X')   {
         System.out.print("X - Which square [1 - 9]: ");
      } else   {
         System.out.print("O - Which square [1 - 9]: ");
      }
   }
   
   public static int getUserInput(char p) {
      Scanner input = new Scanner(System.in);
      int n = 0;
      boolean incorrectInput = true;
      
      while (incorrectInput)  {
         promptPlayerSquare(p);
         n = input.nextInt();
         if (n > 0 && n <= 9) {
            incorrectInput = false;
         }
      }
      return n;
   }
}