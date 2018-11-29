public class Syema7d {
   public static void main(String[] args) {
      boolean[][] aa = {{false, false, false},
                        {false, true, false},
                        {true, false, true}
                       };
      boolean[][] bb = {{false, true, false},
                        {false, true, false},
                        {false, true, false}
                       };
      boolean[][] cc = {{true, false, false},
                        {false, true, true},
                        {true, false, false}
                       };
      System.out.print(largestIndexedHappyRow(cc));
   }
   
   public static int largestIndexedHappyRow( boolean[][] table )  {
      int trues;
      int m = -1;
      
      for(int row = 0; row < table.length; row++)  {
      trues = 0;
         for(int col = 0; col < table[row].length; col++)   {
            if(table[row][col] == true)   {
               trues++;
            }
         }
         if(trues == row)  {
            if(trues > m) {
               m = trues;
            }
         }
      }
      return m;
   }
}