public class MaxArray {
   public static void main(String[] args) {
      
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
      System.out.print(max);
   }
}