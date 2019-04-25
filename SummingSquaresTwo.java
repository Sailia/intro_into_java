public class SummingSquaresTwo   {
   public static void main(String[] args) {
      int c = 41;
      System.out.println(isSquareSum(c));
   }
   
   public static boolean isSquareSum(int c)  {
      boolean sumSquare = false;
      
      for(int a = 1; a < c; a++) {
         for(int b = a; b < c; b++) {
            if((a*a) + (b*b) == c)  {
               sumSquare = true;
            }
         }
      }
      return sumSquare;
   }
}