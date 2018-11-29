public class Syema8d {
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
      int happy;
      int index = -1;
      
      for(int row = 0; row < table.length; row++)  {
      happy = 0;
         for(int col = 0; col < table[row].length; col++)   {
            if(table[row][col] == true)   {
               happy++;
            }
         }
         if(happy == row)  {
            if(happy > index) {
               index = happy;
            }
         }
      }
      return index;
   }
}