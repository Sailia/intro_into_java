public class CommonCount   {
   public static void main(String[] args) {
      int[] arrOne = {2.3, 9.0, 12.1, 21.5, 30.6};
      int[] arrTwo = {1.4}; 
   }
   
   public static int commonCount(double[] x, double[] y) {
      int count = 0;
      for(int outer = 0; outer < x.length; outer++)   {
         for(int inner = 0; inner < y.length; inner++)   {
            if(x[outer] == y[inner])   {
               count++;
            }
         }
      }
      return count;
   }
}