import java.util.Scanner;

public class Problem1   {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int count = 0, num2 = 1, n, n1;
      
      System.out.print("Enter n: ");
      n = input.nextInt();
      System.out.println("Enter 1 to " + n + " in order");
      
      while(num2 <= n)  {
         n1 = input.nextInt();
         if(n1 != num2) {
            System.out.println("Not in order. Start over");
            num2 = 1;
            count++;
         } else {
            num2++;
         }
      }
      System.out.println("You started over " + count + " times");
   }
}