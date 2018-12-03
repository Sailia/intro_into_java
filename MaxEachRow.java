public class MaxEachRow {
   public static void main(String[] args) {
      int[][] arr = {{23, 8, 12, 9, 6},
                     {-5, 0, 1, -3, -4},
                     {4, 17, 23, 88, 91},
                     {2, 14, 9, 4, 0}
                    };
      int[] arrResult = maxEachRow(arr);
      for(int index = 0; index < arrResult.length; index++) {
         System.out.print(arrResult[index] + " ");
      }
   }
   
   public static int[] maxEachRow( int[][] table ) {
      int max = 0;
      int max1 = 0;
      int[] arr = new int[4];
      
      for(int outer = 0; outer < table.length; outer++)  {
         for(int inner = 0; inner < table[outer].length; inner++) {
            max1 = table[outer][inner];
            max = Math.max(max, max1);
         }
         arr[outer] = max;
         max = 0;
      }
      return arr;
   } 
}