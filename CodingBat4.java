public class CodingBat4 {   
   public static void main(String[] args) {
      int result = 12;
      System.out.print(sumEvenDigits(result));
   }
   
   public static int sumEvenDigits(int n) {
     int sum = 0;
     
     while(n / 10 != 0)  {
       if(n % 2 == 0)   {
         sum += n % 10;
         n = n / 10;
       }
     }
     sum += n;
     return sum;
   }
}