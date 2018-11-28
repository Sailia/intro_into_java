public class CodingBat3 {
   public static void main(String[] args) {
      System.out.print(sumDigits(2376));
   }
   
   public static int sumDigits(int n) {
      int sum = 0;
      
      while(n / 10 != 0)   {
         sum += n % 10;
         n = n / 10;
      }
      sum += n;
      return sum;
   }
}