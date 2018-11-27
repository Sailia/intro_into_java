public class SyemaC  {
   public static void main(String[] args) {
      int table[][] = {{5,35,1,5},{1,2,1,4},{8,7,5,4},{6,1,12,1}};

//       for(int outer = 0; outer < table.length; outer++)  {
//          for(int inner = 0; inner < table[outer].length; inner++) {
//             System.out.print(table[outer][inner] + " ");
//          }
//       }
      int sum = indexOfHighestRowSum(table);
      System.out.print(sum);
      
   }
   
   public static int indexOfHighestRowSum(int[][] A) {
      int sum = 0;
      int currentSum = 0;
      int row = 0;
      
      for(int outer = 0; outer < A.length; outer++)   {
      currentSum = 0;
         for(int inner = 0; inner < A[outer].length; inner++)  {
            currentSum += A[outer][inner];
         }
         if(currentSum >= sum)   {
            sum = currentSum;
            row = A[
         }
      }
      
      return row;
   }
}

/* Part 7c:Create a Java class named YourName7c
Write the Java method indexOfHighestRowSum() which takes a two­dimensional array A of positive integers.  
The method returns the index of the row that has the largest sum.  
Assume each row sum is unique.  
For example, if A is the array below then row 0’s values sum to 21, 
row 1’s values sum to 19, row 2’s values sum to 23, row 3’s values sum to 20.  
Since row 2 hasthe highest sum the method would return 2.
*/ 