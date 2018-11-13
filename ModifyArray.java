public class ModifyArray  {
   public static void main(String[] args) {
      double[] a1 = { 8.3, 2.92, 1.2, 7.34, 9.2, 3.07, 13.0 };
      multiplyByTen(a1);
      for(int index = 0; index < a1.length; index++)  {
         System.out.print(a1[index] + " ");
      }
   }
   
   public static void multiplyByTen(double[] x) {
      for(int index = 0; index < x.length; index++)  {
         x[index]*=10;
      }
   }
}