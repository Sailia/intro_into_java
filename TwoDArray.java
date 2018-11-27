import java.util.Scanner;

public class TwoDArray {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[][] myArray = { {6,7,3},
                          {4,7,2},
                          {-1,8,2}
                        };
      int numRows, numCols;
      System.out.print("Enter the number of rows: ");
      numRows = input.nextInt();
      System.out.print("Enter the number of columns: ");
      numCols = input.nextInt();
      
      int[][] table = new int[numRows][numCols];
      int value;
      
      for(int row = 0; row < table.length; row++)  {
         for(int col = 0; col < table[row].length; col++) {
//             System.out.print("Enter a value for the array: ");
//             value = input.nextInt();
            value = (int)(Math.random() * 10) + 1;
            table[row][col] = value;
         }
      }
      printIntArray(table);
   }
   
   public static void printIntArray(int[][] table)  {
      for(int row = 0; row < table.length; row++)  {
         for(int column = 0; column < table[row].length; column++)   {
            System.out.print( table[row][column] + " " );
         }
         System.out.println();
      }
   }
}