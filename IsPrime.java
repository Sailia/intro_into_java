import java.util.Scanner;
public class IsPrime {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n, count = 2;
      boolean prime = true;
      System.out.print("Enter n: ");
      n = input.nextInt();
      
      while(count < n && prime)  {
         if(n % count == 0) {
            System.out.println("Not prime");
            System.out.print("Divisible by " + count);
            prime = false;
         } 
         count++;
      }
      if(prime)   {
         System.out.print("Prime");
      }
   }
}