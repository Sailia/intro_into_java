public class DiagonalSumArray {
   public static void main(String[] args) {
      
   }
   
   public static int sumArray(int[][] myArray)  {
      int sum = 0;
      for(int row = 0; row < myArray.length; row++) {
         for(int col = 0; col < myArray[row].length; col++) {
            if(row == col || row + col == myArray.length - 1)  {
               sum += myArray[row][col];
            } 
         }
      }
      return sum;
   }
}