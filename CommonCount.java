public class CommonCount   {
   public static void main(String[] args) {
      double[] arrOne = {2.3, 9.0, 12.1, 21.5, 30.6};
      double[] arrTwo = {1.4, 8.9, 12.1, 15.4, 21.5, 25.0, 30.6, 32.4}; 
      int count = commonCount(arrOne, arrTwo);
      System.out.print(count);
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