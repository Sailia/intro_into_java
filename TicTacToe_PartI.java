public class TicTacToe_PartI  {
   public static void main(String[] args) {
      System.out.println(identifyPlayer(2));
      System.out.println(identifyPlayer(5));
   }
   
   public static char identifyPlayer(int n)  {
      char xO;
      if (n % 2 == 0)   {
         xO = 'X';
      } else   {
         xO = 'O';
      }
      return xO;
   }
   
   public static int getRow(int n)  {
      int row;
      if (n >= 1 && n <= 3)   {
         row = 0;
      } else if (n >= 4 && n <= 6)  {
         row = 1;
      } else {
         row = 2;
      }
      return row;
   }
   
   public static int getColumn(int n)  {
      int col;
      if (n >= 1 && n <= 3)   {
         col = 0;
      } else if (n >= 4 && n <= 6)  {
         col = 1;
      } else {
         col = 2;
      }
      return col;
   }
}