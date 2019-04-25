public class SummingSquares   {
   public static void main(String[] args) {
      boolean yis = isSquareSum(39);
      System.out.println(yis);
   }
   
   public static boolean isSquareSum(int c)  {
      int a = 1, b = 1;
      boolean sumSquare = false;
      
      while(a < c)   {
         if((a*a) + (b*b) == c)  {
            sumSquare = true;
            b++;
         }  else if(b == c) {
            b = 1;
            a++;
         }  else  {
            b++;
         }
      }
      return sumSquare;
      
      
      
      // boolean isSquare = false;
//       boolean bSquared = false;
//       int a = 1, b = 1;
//       
//       while((a*a) <= (c-1)) {
//          a++;
//       }
//       
//       int cMinusASquared = c - (a*a);
//       
//       while(((a*a) + (b*b) != c) || b < cMinusASquared)  {
//          b++;
//       }
//       
//       if((a*a) + (b*b) == c)  {
//          isSquare = true;
//       }
//       
//       return isSquare;
   }
}