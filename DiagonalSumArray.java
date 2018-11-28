public class DiagonalSumArray {
   public static void main(String[] args) {
      int[][] array = { {3,6,13,9},
                  {5,29,30,25},
                  {21,25,12,19},
                  {31,25,15,14}
                };
      System.out.print(sumArray(array));
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