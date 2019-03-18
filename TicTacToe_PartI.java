import java.util.Scanner;

public class TicTacToe_PartI  {
   public static void main(String[] args) {
      System.out.println(getUserInput('X'));
   }
   
   public static char identifyPlayer(int n)  {
      char evenOrOdd;
      if(n % 2 == 0) {
         evenOrOdd = 'X';
      } else {
         evenOrOdd = 'O';
      }
      return evenOrOdd;
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
   
   public static int getRow(int n)  {
      int row;
      if(n > 0 && n <= 3)  {
         row = 0;
      } else if (n > 3 && n <= 6)   {
         row = 1;
      } else if (n > 6 && n <= 9)   {
         row = 3;
      }
      return row;
   }
   
   public static int getColumn(int n)  {
      int col;
      if(n > 0 && n <= 3)  {
         col = 0;
      } else if (n > 3 && n <= 6)   {
         col = 1;
      } else if (n > 6 && n <= 9)   {
         col = 3;
      }
      return col;
   }
   
}