public class Syema7c {
   public static void main(String[] args) {
      int[][] arr = {{5,10,1,5},
                     {1,2,1,15},
                     {8,7,5,3},
                     {6,1,12,1}
                    };
      System.out.print(indexOfHighestRowSum(arr));
   }
   
   public static int indexOfHighestRowSum( int[][] A )  {
      int largest = 0;
      int result;
      int index = 0;
      
      for(int row = 0; row < A.length; row++)   {
      result = 0;
         for(int col = 0; col < A[row].length; col++) {
            result += A[row][col];
         }
         if(result > largest) {
            largest = result;
            index = row;
         } 
      }
      return index;
   }
}