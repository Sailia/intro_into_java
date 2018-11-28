public class CodingBat2 {
   public static void main(String[] args) {
      System.out.print(sum1toN(8));
   }
   
   public static int sum1toN(int n) {
      int sum = 0;
      
      while(n != 0)  {
         sum += n;
         n--;
      }
      return sum;
   }
}

