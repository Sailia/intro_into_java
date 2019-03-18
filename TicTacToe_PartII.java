import java.util.Scanner;

public class TicTacToe_PartII {
   public static void main(String[] args) {
      int i = 0;
      char player = identifyPlayer(i);
      int square = getUserInput(player);
      int row = getRow(square);
      int col = getColumn(square);
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
   
   public static int getRow(int n)  {
      int row;
      if(n > 0 && n <= 3)  {
         row = 0;
      } else if (n > 3 && n <= 6)   {
         row = 1;
      } else   {
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
      } else   {
         col = 3;
      }
      return col;
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
      boolean correctInput = false;
      
      while (!correctInput)  {
         promptPlayerSquare(p);
         n = input.nextInt();
         if (n > 0 && n <= 9) {
            correctInput = true;
         } else   {
            System.out.println("Invalid input");
         }
      }
      return n;
   }
   
   public static boolean isOccupied(char square)   {
      boolean takenSquare = false;
      if(square == 'X' || square == 'O')  {
         takenSquare = true;
      }
      return takenSquare;
   }
   
   public static void printGameOver(boolean tie, boolean win, char p)   {
      if(tie)  {
         System.out.println("Cats Game!");
      } else {
         System.out.println("Player " + p + " wins!");
      }
   }
}