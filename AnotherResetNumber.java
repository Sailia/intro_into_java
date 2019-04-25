import java.util.Scanner;

public class AnotherResetNumber  {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int startOver = 0, count = 0, n;
      
      System.out.print("Enter n: ");
      n = input.nextInt();
      
      System.out.println("Enter 1 to " + n + " in order.");
      
      for(int i = 1; i <= n; i++)   {
         count = input.nextInt();
         if(i != count) {
            System.out.println("Not in order, start over.");
            i = 0;
            startOver++;
         }
      }
      System.out.print("You started over " + startOver + " times.");
   }
}