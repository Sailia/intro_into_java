import java.util.Scanner;

public class WorkshopProb3 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int cents, quarters, dimes, nickels;
      
      System.out.print("Enter item cost in cents: ");
      cents = input.nextInt();
      
      quarters = cents / 25;
      dimes = (cents / 10);
      nickels = cents % 10;
      
      System.out.println(quarters + " quarters");
      System.out.println(dimes + " dimes");
      System.out.println(nickels + " nickels");
      
   }
}