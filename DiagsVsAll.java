public class DiagsVsAll {
   public static void main(String[] args) {
      int[][] a = {{5, 3, 3, 10},
                   {12, 4, 7, 6},
                   {1, 11, 2, 2},
                   {5, 10, 0, 3}};
      int[][] b = {{1, 1, 0, 3},
                   {1, 2, 5, 10},
                   {0, 5, 2, 5}};             
                   
      System.out.println(diagsOrAll(b));
   }
   
   public static int diagsOrAll(int[][] grid)   {
      int sumDiags = 0, sumOthers = 0, max = -1;
      
      if(grid.length == grid[0].length)   {
         for(int i = 0; i < grid.length; i++)   {
            for(int j = 0; j < grid[0].length; j++)   {
               if(i == j || i + j == grid[0].length - 1) {
                  sumDiags += grid[i][j];
               } else {
                  sumOthers += grid[i][j];
               }
            }
         }
         if(sumDiags > sumOthers)   {
            max = sumDiags;
         }  else   {
            max = sumOthers;
         }
      }
      return max;
   }
}