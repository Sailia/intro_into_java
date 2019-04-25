import java.util.Scanner;

public class TicTacToe_PartIII  {
   public static void main(String[] args) {
      char[][] board = {{'1','2','3'},
                      {'4','5','6'},
                      {'7','8','9'}};
      displayBoard(board);
      

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
   
   public static void displayBoard(char[][] board)   {
      for(int row = 0; row < board.length; row++)  {
         System.out.println("   |   |   ");
         for(int col = 0; col < board[0].length; col++)  {
            System.out.print(" " + board[row][col] + " ");
            if(col < 2) {
               System.out.print("|");
            }
         }
         if(row < 2) {
            System.out.println();
            System.out.println("   |   |   ");
            System.out.println("-----------");
         } else if(row == 2) {
            System.out.println();
            System.out.println("   |   |   ");         
         }
      }
      
      public static boolean isWinner(int[][] board, char p) {
         boolean winner = false;
         
         if(board[0][0] == p && board[0][1] == p && board[0][2] == p)   {
            winner = true;
         }  else if(board[1][0] == p && board[1][1] == p && board[1][2] == p)  {
            winner = true;
         }  else if(board[2][0] == p && board[2][1] == p && board[2][2] == p)  {
            winner = true;
         }  else  {
            for(int i = 0; i < board.length; i++)  {
               for(int j = 0; j < board[0].length; j++)  {
                  if(i == j && board[i][j] == p)   {
                     winner = true;
                  } else if(i + j == 2 && board[i][j] == p)   {
                     winner = true;
                  }
               }
            }
         }
         return winner;
      }
      
      public static boolean isTie(int[][] board)   {
         boolean tie = false;
         int count = 0;
         for(int i = 0; i < board.length; i++)  {
            for(int j = 0; j < board[0].length; j++)  {
               if(board[i][j] == 'X' || board[i][j] == 'O') {
                  count++;
               }
            }
         }
         if(count == 9) {
            tie = true;
         }
         return tie;
      }
   }  
}