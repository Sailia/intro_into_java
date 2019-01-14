public class IndexOfHighestRow   {
   public static void main(String[] args) {
      int[][] array = {{5, 10, 1, 5},
                       {1, 2, 1, 15},
                       {8, 7, 5, 3},
                       {6, 1, 12, 1}
                      };
      System.out.println(indexOfHighestRowSum(array));
   }
   
   public static int indexOfHighestRowSum(int[][] A)  {
      int sum = 0; 
      int newSum = 0;
      
      for(int outer = 0; outer < A.length; outer++)   {
         newSum = 0;
         for(int inner = 0; inner < A[outer].length; inner++)  {
            newSum += A[outer][inner];
         }        
         if(newSum > sum) {
            sum = newSum;
         }
      }
      return sum;
  }
}