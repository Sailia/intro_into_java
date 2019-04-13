public class smallerFirstHalf {
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
      int midpoint = arr.length * arr[0].length;
      midpoint = midpoint/2;
      int max = arr[0][0], min = arr[arr.length-1][arr[0].length-1];
      int count = 1;
      boolean tinyFirstHalf = false;
      
      for(int row = 0; row < arr.length; row++) {
         for(int col = 0; col < arr[0].length; col++) {
            if(count < midpoint)  {
               min = Math.min(min, arr[row][col]);
            } else {
               max = Math.max(max, arr[row][col]);
            }
         count++;
         }
      }
      if(min < max) {
         tinyFirstHalf = true;
      }
      return tinyFirstHalf;
   }
}