public class SecondTry  {
   public static void main(String[] args) {
      int[][] a1 = {{4, 3, 7},
                    {7, 7, 9},
                    {9, 8, 9}};
      boolean b1 = smallerFirstHalf(a1);
      System.out.println(b1); 
      int[][] a2 = {{12, 22},
                    {44, 33}};
      boolean b2 = smallerFirstHalf(a2);
      System.out.println(b2); 
   }
   
   public static boolean smallerFirstHalf(int[][] arr)   {
      int midpoint = (arr.length * arr[0].length) / 2;
      boolean smaller = false;
      int count = 1;
      int firstHalf = arr[0][0], secondHalf = arr[arr.length - 1][arr[0].length - 1];
      
      for(int row = 0; row < arr.length; row++) {
         for(int col = 0; col < arr[0].length; col++) {
            if(count <= midpoint) {
               firstHalf = Math.max(firstHalf, arr[row][col]);
            } else   {
               secondHalf = Math.min(secondHalf, arr[row][col]);
            }
            count++;
         }
      }
      if(firstHalf < secondHalf) {
         smaller = true;
      }
      return smaller;
   }  
}