public class RowWithMostZeros {
   public static void main(String[] args) {
      int[][] arr = {{3,1,-3,0},
                     {0,-5,-0,0},
                     {6,0,0,9}
                    };
      System.out.print(rowWithMostZeros(arr));
   }
   
   public static int rowWithMostZeros(int[][] table)  {
      int mostZeros = 0;
      int previousRow = 0;
      int whichRowIndex = 0;
      
      for(int outer = 0; outer < table.length; outer++)  {
         for(int inner = 0; inner < table[outer].length; inner++) {
            if(inner == 0) {
               previousRow++;
            }
         }
         if(previousRow > mostZeros)   {
            mostZeros = previousRow;
            whichRowIndex++;
         }
         previousRow = 0;
      }
      return whichRowIndex;
   }
}