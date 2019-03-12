import java.util.Scanner;
public class ThreeInARow   {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = 0, n2 = 1, count = 1;
      
      while (count < 3) {
         System.out.print("Enter an integer: ");
         n = input.nextInt();
         if (n == n2)   {
            count++;
            n2 = n;
         } else {
            n2 = n;
            count = 1;
         }
      }
      System.out.println("Same entered 3 in a row.");
   }
}