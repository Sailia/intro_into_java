public class November20 {
   public static void main(String[] args) {
      int[][] table = new int[3][3];
      
      print2DArray(table);
      System.out.println();
      
      addNumbers(table);
      
      print2DArray(table);
   }
   
   public static void addNumbers( int[][] array )  {
      int count = 1;
      for(int row = 0; row < array.length; row++)  {
         //tells us how many rows there are for each column 
         for(int col = 0; col < array[row].length; col++)   {
            array[row][col] = count;
            count++;
         }
      }
   }
   
   public static void print2DArray(int[][] array)  {
      for(int outer = 0; outer < array.length; outer++)  {
         for(int inner = 0; inner < array[outer].length; inner++) {
            System.out.print(array[outer][inner] + " ");
         }
         System.out.println();
      }
   }  
}