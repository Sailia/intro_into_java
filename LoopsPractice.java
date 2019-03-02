import java.util.Scanner;

public class LoopsPractice {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n, sum = 0, digits = 0, digit = 0;
   
      System.out.print("Enter a positive integer: ");
      n = input.nextInt();
      sum += n % 10;

      do {
        
         n = n / 10;
         if(n > 0) {
            sum += n % 10;
         } else {
            System.out.println("Digit sum is " + sum);
               digits += sum % 10;
               System.out.println("Digit sum is " + digit);
               n = digits / 10;
         }
        

      } while (n > 0 && sum >= 10);
   }
}