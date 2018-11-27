public class November27 {
   public static void main(String[] args) {
      int[][] myArray = { {6,7,3},
                          {4,7,2},
                          {-1,8,2}
                        };
      printIntArray(myArray);
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