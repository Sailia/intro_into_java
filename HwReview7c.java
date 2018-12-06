public class HwReview7c {
   public static void main(String[] args) {
   
   }
   
   public static int indexOfHighestRowSum(int[][] A)   {
      int sum;
      int max = -1;
      int index = 0;
      
      for(int row = 0; row < A.length; row++)   {
      sum = 0;
         for(int col = 0; col < A[row].length; col++) {
            sum = sum + A[row][col];
         }
         if(sum > max)  {
            max = sum;
            index = row;
         }         
      } 
      return index;
   }
}