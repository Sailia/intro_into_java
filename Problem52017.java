public class Problem52017  {
   public static void main(String[] args) {
      int[][] aaa = {{2,4,7,8},
                     {9,13,18,25},
                     {31,45,59,66},
                     {78,88,91,99}
                    };
                    
      int[][] bbb = {{1,3,4,6},
                     {7,12,15,18},
                     {23,26,44,50},
                     {55,78,60,99}
                    }; 
      System.out.print(isTableSorted(bbb));
   }
   
   public static boolean isTableSorted(int[][] grid)  {
      boolean result = false;
      
      for(int row = 0; row < grid.length; row++)   {
         for(int col = 0; col < grid[row].length; col++) {
            if(row < grid.length)   {
               if(col < grid[row].length)   {
                  if(grid[row][col] < grid[row][col+1])  {
                     if(grid[row+1][col] > grid[row][col])  {
                        result = true;
                     }
                  }
               }
            }
            else  {
               result = false;
            }
         }
      }
      return result;
   }
}