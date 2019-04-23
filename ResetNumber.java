import java.util.Scanner;

public class ResetNumber   {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n, count = 1, last = 0, times = 0;
      
      System.out.print("Enter n: ");
      n = input.nextInt();
      System.out.println("Enter 1 to " + n + " in order: ");
      
      while(count <= n) {
         last = input.nextInt();
         
         if(last == count) {
            count++;
         }  else  {
            System.out.println("Not in order. Start over.");
            count = 1;
            times++;
         }
      }
      System.out.print("You started over " + times + " times.");
   }
}