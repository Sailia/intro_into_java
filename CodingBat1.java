public class CodingBat1 {
   public static void main(String[] args) {
      System.out.print(sumNtoM(7,9));
   }
   
   public static int sumNtoM(int n, int m) {
     int sum = 0;
     if(n == m)  {
       return n;
     }
     while(n <= m) {
       sum += n;
       n++;
     }
     return sum;
   }
}