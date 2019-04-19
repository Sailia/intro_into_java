public class SummingSquares   {
   public static void main(String[] args) {
      boolean yis = isSquareSum(41);
      System.out.println(yis);
   }
   
   public static boolean isSquareSum(int c)  {
      boolean isSquare = false;
      int a = 1, b = 2;
      
      while((a < c && b < c)) {
         if((Math.sqrt(a) + Math.sqrt(b) == c))  {
            isSquare = true;
         }
         a++;
         b++;
      } 
      return isSquare;
   }
}