public class November20 {
   public static void main(String[] args) {
      int[][] table = new int[3][3];
      
      print2DArray(table);
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