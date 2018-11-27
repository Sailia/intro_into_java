public class SumArray   {
   public static void main(String[] args) {
      int[][] array = { 
      {3,6,5,2},
      {-1,0,9,4},
      {3,8,4,0}
      };
      
      System.out.print(sumArray(array));   
   }
   
   public static int sumArray(int[][] myArray) {
      int sum = 0;
      
      for(int row = 0; row < myArray.length; row++)   {
         for(int column = 0; column < myArray[row].length; column++) {
            sum += myArray[row][column];
         }
      }
      return sum;
   }
}