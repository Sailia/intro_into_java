public class TicTacToe_PartI  {
   public static void main(String[] args) {
      System.out.println(identifyPlayer(2));
      System.out.println(identifyPlayer(5));
   }
   
   public static char identifyPlayer(int n)  {
      char evenOrOdd;
      if (n % 2 == 0)   {
         evenOrOdd = 'X';
      } else   {
         evenOrOdd = 'O';
      }
      return evenOrOdd;
   }
   
   public static int getRow(int n)  {
      int row;
      if (n >= 1 && n <= 3)   {
         row = 0;
      } else if (n >= 4 && n <= 6)  {
         row = 1;
      } else if (n >= 7 && n <= 9)  {
         row = 2;
      }
   }
}