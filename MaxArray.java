public class MaxArray {
   public static void main(String[] args) {
      int[][] twoDArray = { {2,3,5,6},
                            {3,4,7,9},
                            {2,5,8,9}
                          };
      System.out.print(sumArray(twoDArray));
   }
   
   public static int sumArray(int[][] myArray)  {
      int max = -1;
      for(int row = 0; row < myArray.length; row++) {
         for(int col = 0; col < myArray[row].length; col++) {
            if(myArray[row][col] > max )  {
               max = myArray[row][col];
            }
         }
      }
      return max;
   }
}