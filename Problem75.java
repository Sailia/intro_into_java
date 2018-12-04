import java.util.Scanner;

public class Problem75  {
   public static void main(String[] args) {
      System.out.print("Enter an odd number: ");
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      char[][] table = plusInSquare(num);
      
      for(int outer = 0; outer < table.length; outer++)  {
         for(int inner = 0; inner < table[outer].length; inner++) {
            System.out.print(table[outer][inner] + " ");
         }
         System.out.println();
      }
   }
   
   public static char[][] plusInSquare(int n)   {
      char[][] table = new char[n][n];
      
      for(int row = 0; row < table.length; row++)  {
         for(int col = 0; col < table[row].length; col++)   {
            if(row == (table.length/2) || col == (table.length/2) || row == 0 || row == n-1 || col == 0 || col == n-1)   {
               table[row][col] = 'X';
            } 
            else   {
               table[row][col] = '.';
            }
         }
      }
      return table;
   }
}